class Solution {
    public int solution(String A, String B) {
        int cnt = 0, len = A.length();
        String temp = A;
        
        for(int i=0; i<A.length(); i++){
            if(temp.equals(B)){
                return cnt;
            }
            temp = temp.substring(len-1)+temp.substring(0,len-1);
            cnt++;
        }
        return -1;
    }
}