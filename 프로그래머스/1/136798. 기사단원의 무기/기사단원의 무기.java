class Solution {
    public int solution(int number, int limit, int power) {
        
        int cnt = 0;
        for(int i=1; i<=number; i++){
            int n = 0;
            for(double j=1; j*j<=i; j++){
                if(j*j==i){
                    n++;
                }else if(i%j==0){
                    n+=2;
                }
            }
            if(n <= limit){
                cnt+=n;
            }else{
                cnt+=power;
            }
        }
        return cnt;
    }
}