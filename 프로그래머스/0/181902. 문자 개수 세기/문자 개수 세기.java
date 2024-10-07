class Solution {
    public int[] solution(String my_string) {
        int[] upper = new int[26];
        int[] lower = new int[26];
        int[] answer = new int[52];
        
        for(int i=0; i<my_string.length(); i++){
            char s = my_string.charAt(i);
            if(Character.isLowerCase(s)){
                int index = (int)(s-'a');
                lower[index]++;
            }else if(Character.isUpperCase(s)){
                int index = (int)(s-'A');
                upper[index]++;
            }
        }
        for(int i=0; i<26; i++){
            answer[i] = upper[i];
        }
        int index = 26;
        for(int i=0; i<26; i++){
            answer[index++] = lower[i];
        }
        return answer;
    }
}