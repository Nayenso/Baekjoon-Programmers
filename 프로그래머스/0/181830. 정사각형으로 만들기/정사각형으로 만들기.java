class Solution {
    public int[][] solution(int[][] arr) {
        int sero = arr.length;
        int garo = arr[0].length;
        int max = (sero>garo)?sero:garo;
        
        int[][] temp = new int[max][max];
        
        for(int i=0; i<sero; i++){
            for(int j=0; j<garo; j++){
                temp[i][j] = arr[i][j];
            }
        }
        return temp;
    }
}