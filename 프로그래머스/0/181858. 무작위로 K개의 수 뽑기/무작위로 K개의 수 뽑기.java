class Solution {
    public int[] solution(int[] arr, int k) {
        int[] Arr = new int[k];
        int[] num = new int[100001];
        boolean flag = false;
        int index = 0;
        
        for(int i=0; i<arr.length; i++){
            if(num[arr[i]]>0){
                continue;
            }else{
                Arr[index++] = arr[i];
                num[arr[i]]++;
                if(index==k){
                    flag = true;
                    break;
                }
            }
        }
        if(flag==false){
            for(int i=index; i<k; i++){
                Arr[i] = -1;
            }
        }
        return Arr;
    }
}