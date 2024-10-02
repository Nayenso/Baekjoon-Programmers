class Solution {
    public int[] solution(int n) {
        int size = 0;
        for(int i = 1; i<=n; i++){
            if(n%i==0){
                size++;
            }
        }
        int[] arr = new int[size];
        int index = 0;
        for(int i = 1; i<=n; i++){
            if(n%i==0){
                arr[index++] = i; 
            }
        }
        return arr;
    }
}