class Solution {
    public int solution(int[] arr, int idx) {
        int answer = 0;
        int flag = 0;
        
        for(int i = idx; i < arr.length; i++){
            if(arr[i] == 1){
                answer = i;
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            answer = -1;
        }
        return answer;
    }
}