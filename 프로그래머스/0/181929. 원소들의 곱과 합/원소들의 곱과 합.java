class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int allPlus = 0, allMulti = 1;
        for (int i = 0; i < num_list.length; i++){
            allPlus += num_list[i];
            allMulti *= num_list[i];
        }
        if(allPlus*allPlus > allMulti){
            answer = 1;
        }else{
            answer = 0;
        }
        return answer;
    }
}