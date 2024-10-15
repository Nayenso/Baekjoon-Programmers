import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int cnt = 0, index = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor == 0){
                cnt++;
            }
        }
        if(cnt == 0){
            int[] empty = {-1};
            return empty;
        }
        int[] re = new int[cnt];
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor == 0){
                re[index++] = arr[i];
            }
        }
        
        Arrays.sort(re);
        return re;
    }
}