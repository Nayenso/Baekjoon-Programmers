class Solution {
    public int solution(String s) {
        if(s.charAt(0)=='-'){
            char[] c = s.toCharArray();
            s = s.substring(1);
            return Integer.parseInt(s)*-1;
        }else{
            return Integer.parseInt(s);
        }
        
    }
}