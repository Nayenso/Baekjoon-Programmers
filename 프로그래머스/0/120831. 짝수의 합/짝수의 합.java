class Solution {
    public int solution(int n) {
        int num = 0;
        int i = 1;
        while(true){
            if(i%2 == 0){
                num += i;
            }
            i++;
            if(i > n){
                break;
            }
        }
        return num;
    }
}