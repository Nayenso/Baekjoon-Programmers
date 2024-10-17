import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i=0; i<commands.length; i++){
            int index = 0, k = commands[i][2];
            int size = commands[i][1]-commands[i][0]+1;
            int[] temp = new int[size];
            
            for(int j=commands[i][0]-1; j<=commands[i][1]-1; j++){
                temp[index++] = array[j];
            }
            Arrays.sort(temp);
            answer[i] = temp[k-1];
        }
        return answer;
    }
}