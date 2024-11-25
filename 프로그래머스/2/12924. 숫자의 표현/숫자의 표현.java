class Solution {
    public int solution(int n) {
        int check = 1;
        int cnt = 0;
        
        while(check<=n){
            int c = 0;
            for(int i=check; i<=n; i++){
                c+=i;
                if(c==n){
                    cnt++;
                    break;
                }
                if(c>n){
                    break;
                }
            }
            check++;
        }
        return cnt;
    }
}