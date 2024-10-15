import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int len = arr.length;
        int cnt = 1;
        
        for(int i=1; i<len; i++){
            if(arr[i-1]==arr[i]){
                continue;
            }else{
                cnt++;
            }
        }
        int[] re = new int[cnt];
        int index = 0;
        
        for(int i=1; i<len; i++){
            if(arr[i-1]!=arr[i]){
                re[index++] = arr[i-1];
            }
        }
        re[cnt-1] = arr[len-1];
        return re;
    }
}