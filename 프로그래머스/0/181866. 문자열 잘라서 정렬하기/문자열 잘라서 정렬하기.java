import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] arr = myString.split("x");
        int cnt = 0;
        for(String s : arr){
            if(!s.equals("")){
                cnt++;
            }
        }
        String[] re = new String[cnt];
        int index = 0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals("")){
                continue;
            }
            re[index++] = arr[i];
        }
        Arrays.sort(re);
        return re;
    }
}