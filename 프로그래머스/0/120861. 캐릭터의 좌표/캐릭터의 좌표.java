class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] output = new int[2];
        int g = 0, s = 0;
        
        int size = keyinput.length;
        int garoMax = board[0]/2;
        int seroMax = board[1]/2;
        
        for(int i=0; i<size; i++){
            String op = keyinput[i];
            if(op.equals("left")){
                if(garoMax*(-1) < g){
                    g--;
                }
            }else if(op.equals("right")){
                if(g < garoMax){
                    g++;
                }
            }else if(op.equals("up")){
                if(s < seroMax){
                    s++;
                }
            }else if(op.equals("down")){
                if(seroMax*(-1) < s){
                    s--;
                }
            }
        }
        output[0] = g;
        output[1] = s;
        return output;
    }
}