import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        ArrayList<Integer> li = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            li.add(arr[i]);
        }
        
        for(int i=0; i<query.length; i++){
            int index = query[i];
            if(i%2==0){
                for(int j=li.size()-1; j>index; j--){
                    li.remove(j);
                }
            }else{
                for(int j=0; j<index; j++){
                    li.remove(0);
                }
            }
        }
        int[] A = new int[li.size()];
        for(int i=0; i<li.size(); i++){
            A[i] = li.get(i);
        }
        return A;
    }
}