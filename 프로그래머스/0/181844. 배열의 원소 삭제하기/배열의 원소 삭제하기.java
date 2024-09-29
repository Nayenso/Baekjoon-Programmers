class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int arrLen = arr.length;
        int delLen = delete_list.length;
        int cnt = 0;
        

        for(int i=0; i < delLen; i++){
            for(int j = 0; j<arrLen; j++){
                if(delete_list[i] == arr[j]){
                    arr[j] = -1;
                        cnt++;
                }
            }
        }
        
        int[] re = new int[arrLen-cnt];
        int index = 0;
        for(int i= 0; i < arrLen; i++){
            if(arr[i] == -1){
                continue;
            }
            re[index++] = arr[i];
        }
        return re;
    }
}