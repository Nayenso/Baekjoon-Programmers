import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] temp = new int[num_list.length];
        int[] result = new int[5];
        
        for(int i = 0; i < temp.length; i++){
            temp[i] = num_list[i];
        }
        Arrays.sort(temp);
        
        for(int i = 0; i < 5; i++){
            result[i] = temp[i];
        }
        return result;
    }
}