import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int cnt = 0;
        
        for(int i=0; i<my_string.length(); i++){
            if(0<=my_string.charAt(i)-'0' && my_string.charAt(i)-'0'<=9){
                cnt++;
            }
        }
        int[] arr = new int[cnt];
        int index = 0;
        for(int i=0; i<my_string.length(); i++){
            if(0<=my_string.charAt(i)-'0' && my_string.charAt(i)-'0'<=9){
                arr[index++] = my_string.charAt(i)-'0';
            }
        }
        Arrays.sort(arr);
        return arr;
    }
}