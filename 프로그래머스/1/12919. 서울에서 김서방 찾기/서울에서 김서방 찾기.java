class Solution {
    public String solution(String[] seoul) {
        int lo = 0;
        
        for(int i=0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")){
                lo = i;
                break;
            }
        }
        String re = "김서방은 "+lo+"에 있다";
        return re;
    }
}