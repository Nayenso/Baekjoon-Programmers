class Solution {
    public int solution(int[] array) {
        int len = array.length;
        int mid = len/2;
        
        for(int i = 0; i < len -1; i++){
            for(int j = i+1; j < len; j++){
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array[mid];
    }
}