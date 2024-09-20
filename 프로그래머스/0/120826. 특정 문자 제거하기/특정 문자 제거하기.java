class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        char[] word = my_string.toCharArray();
        char let = letter.charAt(0);
        
        for(int i = 0; i < word.length; i++){
            if(word[i] == let){
                continue;
            }
            answer += Character.toString(word[i]);
        }
        return answer;
    }
}