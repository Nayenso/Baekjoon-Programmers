import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int size = arr.length;
        
        for(int i=0; i<size;){
            if(list.isEmpty()){
                list.add(arr[i]);
                i++;
            }else if(!list.isEmpty() && list.get(list.size()-1) == arr[i]){
                list.remove(list.size()-1);
                i++;
            }else if(!list.isEmpty() && list.get(list.size()-1) != arr[i]){
                list.add(arr[i]);
                i++;
            }
        }
        if(list.size()==0){
            int[] temp = {-1};
            return temp;
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i).intValue();
        }
        return answer;
    }
}