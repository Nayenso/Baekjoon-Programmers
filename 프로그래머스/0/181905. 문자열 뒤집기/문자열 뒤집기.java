class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        char[] word = my_string.toCharArray();
        
        for (int i = 0; i < s; i++){
            answer += Character.toString(word[i]);
        }
        int start = s, end = e;
        while(start < end){
            char temp;
            temp = word[start];
            word[start] = word[end];
            word[end] = temp;
            start++;
            end--;
        }
        for (int i = s; i < word.length; i++){
            answer += Character.toString(word[i]);
        }
        
        return answer;
    }
}