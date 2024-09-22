class Solution {
    public int solution(int n) {
        int s = 1;
        int i = 1;
        while(true){
            s *= i++;
            if(s > n){
                return (i-2);
            }
        }
    }
}