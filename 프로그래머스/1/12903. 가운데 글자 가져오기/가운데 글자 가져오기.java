class Solution {
    public String solution(String s) {
        int len = s.length();
        char[] c = s.toCharArray();
        if(len%2!=0){
            return String.valueOf(c[len/2]);
        }else{
            String t = String.valueOf(c[(len/2)-1])+String.valueOf(c[len/2]);
            return t;
        }
    }
}