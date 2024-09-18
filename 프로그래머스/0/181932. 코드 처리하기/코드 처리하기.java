class Solution {
    public String solution(String code) {
        String answer = "";
        char[] codeWord = code.toCharArray();
        int mode = 0;
        
        for (int i = 0; i < codeWord.length; i++){
            if(mode == 0){
                if(codeWord[i] == '1'){
                    mode = 1;
                    continue;
                }
                if(i % 2 == 0){
                    answer += Character.toString(codeWord[i]);
                }
            }
            if(mode == 1){
                if(codeWord[i] == '1'){
                    mode = 0;
                    continue;
                }
                if(i % 2 != 0){
                    answer += Character.toString(codeWord[i]);
                }
            }
          
        }
        
        if(answer == ""){
            answer += "EMPTY";
            return answer;
        }
        
        return answer;
    }
}