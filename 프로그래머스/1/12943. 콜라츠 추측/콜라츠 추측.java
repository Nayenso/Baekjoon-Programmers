class Solution {
    public int solution(int num) {
        int cnt = 0;
        
        if(num==1){
            return 0;
        }
        long t = num;
        
        while(t!=1){
            
            if(t%2==0){
                t/=2;
            }else{
                t = t*3 +1;
            }
            cnt++;
            if(cnt==500){
            return -1;
            }
        }

        return cnt;
    }
}