class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        char[] codeWord = code.toCharArray();
        for(int i = 0; i < codeWord.length; i++){
            if(i % q == r){
                answer += String.valueOf(codeWord[i]);
            }
        }
        return answer;
    }
}