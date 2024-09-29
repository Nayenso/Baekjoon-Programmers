class Solution {
    public int solution(int order) {
        int cnt = 0;
        
        if(order == 3 || order == 6 || order == 9){
            return 1;
        }
        
        while(order > 0){
            if(order % 10 == 3 || order % 10 == 6 || order % 10 == 9){
                cnt++;
            }
            order /= 10;
        }
        
        return cnt;
    }
}