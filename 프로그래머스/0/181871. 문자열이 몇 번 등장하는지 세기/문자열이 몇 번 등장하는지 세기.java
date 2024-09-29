class Solution {
    public int solution(String myString, String pat) {
        int sLen = myString.length();
        int pLen = pat.length();
        int cnt = 0;
        
        if(sLen == pLen){
            return myString.contains(pat) ? 1:0;
        }else if(sLen < pLen){
            return 0;
        }
        
        for(int i = 0; i < sLen-pLen+1; i++){
            int index = 0, c = 0;
            for(int j = i; j < i+pLen; j++){
                if(myString.charAt(j) == pat.charAt(index)){
                    c++;
                    index++;
                }
            }
            if(c == pLen){
                cnt++;
            }
        }
        return cnt;
    }
}