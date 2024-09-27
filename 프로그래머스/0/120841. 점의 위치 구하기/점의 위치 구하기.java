class Solution {
    public int solution(int[] dot) {
        int x = dot[0] > 0 ? 1 : -1;
        int y = dot[1] > 0 ? 1 : -1;
        int re = x+y;
        if(re==2){
            return 1;
        }else if(re == -2){
            return 3;
        }else{
            if(x == 1){
                return 4;
            }else{
                return 2;
            }
        }
    }
}