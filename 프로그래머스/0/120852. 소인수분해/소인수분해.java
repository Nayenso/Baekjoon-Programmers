import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> li = new ArrayList<>();
        int s=2;
        
        while (n > 1) {
            if (isDecimal(s)) {
                if(n%s==0){
                    li.add(s);
                }
                while (n % s == 0) {
                    n /= s;
                }
            }
            s++;
        }
        
        int[] arr = new int[li.size()];
        
        for(int i=0; i<arr.length; i++){
            arr[i] = li.get(i);
        }
        return arr;
    }
    
    public static boolean isDecimal(int a){
        int cnt = 0;
        
        for(int i=1; i*i<=a; i++){
            if(a%i==0){
                cnt++;
                if(i!=a/i){
                    cnt++;
                }
            }
        }
        if(cnt==2){
            return true;
        }
        return false;
    }
}