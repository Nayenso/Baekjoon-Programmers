class Solution {
    public int[] solution(int[] arr, int n) {
        int[] result = new int[arr.length];
        int index = 0;
        
        if(arr.length % 2 != 0){
            for(int i = 0; i < arr.length; i++){
                if(i%2 == 0){
                    result[index++] = arr[i] + n;
                }else{
                    result[index++] = arr[i]; 
                }
            }
        }
        
        else{
            for(int i = 0; i < arr.length; i++){
                if(i%2 != 0){
                    result[index++] = arr[i] + n;
                }else{
                    result[index++] = arr[i];   
                }
            }
        }
        
        return result;
    }
}   