class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] returnArr = arr;
        
        for(int i=0; i<queries.length; i++){
            int temp = returnArr[queries[i][0]];
            returnArr[queries[i][0]] = returnArr[queries[i][1]];
            returnArr[queries[i][1]] = temp;
        }
        return returnArr;
    }
}