class Solution {
    public int solution(String[] strArr) {
        int re = 0, cnt = 0;
        int[] arr = new int[1000001];
        int max = Integer.MIN_VALUE;
        
        for(int i=0; i<strArr.length; i++){
            arr[strArr[i].length()]++;
            cnt++;
        }
        int[] compare = new int[cnt];
        int index = 0;
        
        for(int len : arr){
            if(len == 0){
                continue;
            }else{
                compare[index++] = len;
            }
        }
        
        for(int i=0; i<cnt; i++){
            if(compare[i] > max){
                max = compare[i];
            }
        }
        return max;
    }
}