class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        int index = 0;
        
        for(int i:arr){
            answer[index++] = i;
        }
        
        for(int i = 0; i<queries.length; i++){
            for(int j = 0; j< arr.length; j++){
                if(queries[i][0]<=j && j <= queries[i][1]){
                    answer[j]++;
                }
            }
        }
        return answer;
    }
}