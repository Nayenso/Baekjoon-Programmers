class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        char[] mString = my_string.toCharArray();
        
        for(int i = 0; i < mString.length;){
            if(i + c - 1 < mString.length){
                answer += mString[i + c-1];
            }
            i += m;
        }
        
        return answer;
    }
}