import java.util.*;

class Solution {
    public String solution(String s) {
        String[] num = s.split(" ");
        int size = num.length;
        int[] arr = new int[size];
        
        for(int i=0; i<size; i++){
            arr[i] = Integer.parseInt(num[i]);
        }
        Arrays.sort(arr);
        String str="";
        
        str = String.valueOf(arr[0])+" "+String.valueOf(arr[size-1]);
        
        return str;
    }
}