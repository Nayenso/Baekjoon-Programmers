class Solution {
    public int[] solution(int[] arr) {
        int[] re = new int[arr.length];
        for(int i = 0; i<re.length;i++){
            if(arr[i] >= 50 && arr[i] %2==0){
                re[i] = arr[i]/2;
            }else if(arr[i] < 50 && arr[i]%2!=0){
                re[i] = arr[i]*2;
            }else{
                re[i] = arr[i];
            }
        }
        return re;
    }
}