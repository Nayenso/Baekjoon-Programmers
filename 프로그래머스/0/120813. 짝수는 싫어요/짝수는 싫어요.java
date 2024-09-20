class Solution {
    public int[] solution(int n) {
        int cnt;
        int a = 1;
        
        if(n%2 == 0){
            cnt = n/2;
        }else{
            cnt = n/2+1;
        }
        
        int[] result = new int[cnt];
        for(int i = 0; i < cnt; i++){
            result[i] = a;
            if(a <= n){
                a+=2;
            }
        }
        return result;
    }
}