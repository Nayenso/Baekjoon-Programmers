class Solution {
    public int solution(int[][] dots) {
        int gMax = Integer.MIN_VALUE, gMin = Integer.MAX_VALUE;
        int sMax = Integer.MIN_VALUE, sMin = Integer.MAX_VALUE;
        
        for(int i=0; i<dots.length; i++){
            for(int j=0; j<2; j++){
                if(gMax < dots[i][0]){
                    gMax = dots[i][0];
                }
                if(gMin > dots[i][0]){
                    gMin = dots[i][0];
                }
                if(sMax < dots[i][1]){
                    sMax = dots[i][1];
                }
                if(sMin > dots[i][1]){
                    sMin = dots[i][1];
                }
            }
        }
        int garo = gMax-gMin;
        int sero = sMax-sMin;
        return garo*sero;
    }
}