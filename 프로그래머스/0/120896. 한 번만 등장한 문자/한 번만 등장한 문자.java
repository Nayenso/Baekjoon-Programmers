import java.util.*;

class Solution {
    public String solution(String s) {
        int[] arr = new int[26];
        int cnt = 0;
        
        for(int i = 0; i < s.length(); i++){
            int index = (int)(s.charAt(i)-97);
            arr[index]++;
        }
        
        for(int i=0; i<26; i++){
            if(arr[i]==1){
                cnt++;
            }
        }
        
        char[] re = new char[cnt];
        cnt = 0;
        for(int i=0; i<26; i++){
            if(arr[i]==1){
                re[cnt++] = (char)(i + 97);
            }
        }
        Arrays.sort(re);
        
        return (String.valueOf(re));
    }
}