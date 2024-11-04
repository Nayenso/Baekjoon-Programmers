import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();
        int cnt = 0;
        
        for(int i=l; i<=r; i++){
            int num = i;
            if(check(num)){
                list.add(num);
                cnt++;
            }else{
                continue;
            }
        }
        if(cnt == 0){
            return new int[]{-1};
        }
        int[] arr = new int[list.size()];
        for(int i=0; i<arr.length; i++){
            arr[i] = list.get(i);
        }
        Arrays.sort(arr);
        return arr;
    }
    
    public static boolean check(int n){
        while(n>0){
            int temp = n%10;
            n /=10;
            if(temp != 0 && temp != 5){
                return false;
            }
        }
        return true;
    }
}