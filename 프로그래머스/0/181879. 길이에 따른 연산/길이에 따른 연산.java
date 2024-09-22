class Solution {
    public int solution(int[] num_list) {
        int cnt = 1;
        if(num_list.length >= 11){
            for(int num:num_list){
                cnt += num;
            }
            cnt = cnt -1;
        }else{
             for(int num:num_list){
                cnt *= num;
            }
        }
        return cnt;
    }
}