class Solution {
    public int[] solution(int[] num_list, int n) {
        int size = (num_list.length + n-1)/n;
        int[] arr = new int[size];
        int index = 0, cnt = 0;
        
        for(int i = 0; i < num_list.length; i += n){
            if(cnt > size){
                break;
            }
            arr[index++] = num_list[i];
            cnt++;
        }
        return arr;
    }
}