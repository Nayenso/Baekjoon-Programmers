class Solution {
    public int[][] solution(int[] num_list, int n) {
        int size = num_list.length/n;
        int index = 0;
        int[][] arr = new int[size][n];
        for(int i=0; i<size; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = num_list[index++];
            }
        }
        return arr;
    }
}