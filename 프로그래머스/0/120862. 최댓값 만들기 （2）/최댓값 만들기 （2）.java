import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int[] array = numbers;
        int size = array.length;
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i<size-1;i++){
            for(int j = i+1; j < size; j++){
                if(max < array[i]*array[j]){
                    max = array[i]*array[j];
                }
            }
        }
        return max;
    }
}