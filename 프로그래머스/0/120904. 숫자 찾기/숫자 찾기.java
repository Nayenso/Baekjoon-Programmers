class Solution {
    public int solution(int num, int k) {
        String N = String.valueOf(num);
        for(int i = 0; i < N.length(); i++){
            if(N.charAt(i)-'0' == k){
                return i+1;
            }
        }
        
        return -1;
    }
}