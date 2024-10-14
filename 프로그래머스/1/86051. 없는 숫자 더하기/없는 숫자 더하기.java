class Solution {
    public int solution(int[] numbers) {
        int sum = 0;
        int[] arr = new int[10];
        for(int i=0; i<numbers.length; i++){
            arr[numbers[i]]++;
        }
        for(int i=0; i<10; i++){
            if(arr[i]==0){
                sum+=i;
            }
        }
        return sum;
    }
}