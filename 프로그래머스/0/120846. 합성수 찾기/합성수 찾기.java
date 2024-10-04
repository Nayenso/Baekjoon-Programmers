class Solution {
    public int solution(int n) {
        int cnt = 0;
        for(int i = 1; i<=n; i++){
            int t = 0;
            for(int j = 1; j<=i; j++){
                if(i%j == 0){
                    t++;
                }
            }
            if(t>=3){
                cnt++;
            }
        }
        return cnt;
    }
}