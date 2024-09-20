class Solution {
    public String solution(String my_string, int[] indices) {
        char[] word = my_string.toCharArray();
        String result = "";
        
        for(int i = 0; i < word.length; i++){
            for(int j = 0; j < indices.length; j++){
                if(i == indices[j]){
                    word[i] = 'A';
                }
            }
        }
        for(int i = 0; i < word.length; i++){
            if(word[i] != 'A'){
                result+=word[i];
            }
        }
        
        return result;
    }
}