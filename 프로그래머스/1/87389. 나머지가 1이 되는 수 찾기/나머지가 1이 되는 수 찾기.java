class Solution {
    public int solution(int n) {
        for(int t=1; ; t++){
            if(n%t==1){
                return t;
            }
        }
    }
}