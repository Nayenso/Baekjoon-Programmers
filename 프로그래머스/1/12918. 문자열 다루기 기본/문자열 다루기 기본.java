class Solution {
    public boolean solution(String s) {
        boolean flag = true;
        int len = s.length();
        
        for(int i=0; i<len; i++){
            boolean ch = true;
            if(0 <= s.charAt(i)-'0' && s.charAt(i)-'0' <= 9){
                continue;
            }else{
                ch = false;
            }
            if(ch == false){
                flag = false;
                break;
            }
        }
        if((len==4 || len==6) && flag == true){
            return true;
        }else{
            return false;
        }
    }
}