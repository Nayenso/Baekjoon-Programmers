class Solution {
    public String solution(String myString, String pat) {
        int size = myString.length();
        int index = 0, pLen = pat.length();
        
        for(int i= size - pLen; i>=0; i--){
            String temp = myString.substring(i,i+pLen);
            if(pat.equals(temp)){
                index = i;
                break;
            }
        }
        String re = myString.substring(0,index+pLen);
        return re;
    }
}