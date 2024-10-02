class Solution {
    public int solution(int[] array) {
        int cnt = 0;
        
        for(int i = 0; i< array.length; i++){
            int x = 0;
            while(array[i] > 0){
                if(array[i]%10 == 7){
                    x++;
                }
                array[i] /= 10;
            }
            cnt+=x;
        }
        return cnt;
    }
}