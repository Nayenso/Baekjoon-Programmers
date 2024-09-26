class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int flag = arr1.length > arr2.length ? 1:-1;
        int sum1 = 0, sum2 = 0;
        
        if(arr1.length != arr2.length){
            return flag;
        }
        
        for(int i = 0; i < arr1.length; i++){
            sum1 += arr1[i];
            sum2 += arr2[i];
        }
        if(sum1 == sum2){
            return 0;
        }
        int flag2 = sum1>sum2?1:-1;
        return flag2;
    }
}