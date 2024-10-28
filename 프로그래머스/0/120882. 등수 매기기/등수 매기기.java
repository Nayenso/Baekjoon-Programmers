class Solution {
    public int[] solution(int[][] score) {
        int size = score.length;
        double[] avg = new double[size];
        
        for(int i=0; i<size; i++){
            double temp = (score[i][0]+score[i][1])/2.0;
            avg[i] = temp;
        }
        
        int[] Rank = new int[size];
        
        for(int i=0; i<size; i++){
             int rank = 1;
            for(int j=0; j<size; j++){
                if(avg[i]<avg[j]){
                    rank++;
                }
            }
            Rank[i] = rank;
        }
        return Rank;
    }
}