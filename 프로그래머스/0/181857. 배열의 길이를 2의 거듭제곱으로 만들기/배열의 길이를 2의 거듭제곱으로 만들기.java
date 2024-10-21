class Solution {
    public int[] solution(int[] arr) {
        int size = arr.length;
        int len = 1;
        
        for(int i=1; i<=size; i++){
            if(size <= len){
                break;
            }
            len*=2;
        }
        int[] returnArr = new int[len];
        for(int i=0; i<len; i++){
            if(i<size){
                returnArr[i] = arr[i];
            }else{
                returnArr[i] = 0;
            }
        }
        return returnArr;
    }
}