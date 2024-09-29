class Solution {
    public int solution(int[] sides) {
        int max = sides[0];
        int[]arr = {1,2};
        
        if(max < sides[1]){
            max = sides[1];
            arr[0] = 0;
        }
        if(max < sides[2]){
            max = sides[2];
            arr[1] = 0; 
        }
        int len = sides[arr[0]]+sides[arr[1]];
        if(max < len){
            return 1;
        }
        return 2;
    }
}