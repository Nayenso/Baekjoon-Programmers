class Solution {
    public int solution(int[] array, int n) {
        int min = (n-array[0]<0)?(n-array[0])*-1 : n-array[0];
        int re = array[0];
        
        for(int i=1; i<array.length; i++){
            int m = (n-array[i]<0)?(n-array[i])*-1 : n-array[i];
            
            if(m < min || (m == min && array[i] < re)){
                min = m;
                re = array[i];
            }
        }
        return re;
        
    }
}