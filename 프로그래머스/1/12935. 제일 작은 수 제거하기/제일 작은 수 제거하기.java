class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        
        if(len == 1){
            int[] a = {-1};
            return a;
        }else{
            int min = Integer.MAX_VALUE, index = 0;
            int[] a = new int[len-1];
            
            for(int i=0; i<len; i++){
                if(min > arr[i]){
                    min = arr[i];
                }
            }
            for(int i=0; i<len; i++){
                if(arr[i]==min){
                    continue;
                }else{
                    a[index++] = arr[i];
                }
            }
            return a;
        }
    }
}