class Solution {
    public int solution(int[] sides) {
        int cnt = 1;
        for(int i=1; i<sides[0]; i++){
            if(sides[0]<i+sides[1]){
                cnt++;
            }
        }
        for(int i=1; i<sides[1]; i++){
            if(sides[1]<i+sides[0]){
                cnt++;
            }
        }
        return cnt;
    }
}