class Solution {
    public int solution(int i, int j, int k) {
        int cnt = 0;
        
        for(int t=i; t<=j; t++){
            int a = t;
            while(a>0){
                if(a%10==k){
                    cnt++;
                }
                a /= 10;
            }
        }
        return cnt;
    }
}