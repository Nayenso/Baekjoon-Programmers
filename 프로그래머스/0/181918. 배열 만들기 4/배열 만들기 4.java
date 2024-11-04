import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length;){
            if(list.isEmpty()){
                list.add(arr[i]);
                i++;
            }else if(!list.isEmpty() && list.get(list.size()-1) < arr[i]){
                list.add(arr[i]);
                i++;
            }else if(!list.isEmpty() && list.get(list.size()-1) >= arr[i]){
                list.remove(list.size()-1);
            }
        }
        int[] temp = new int[list.size()];
        for(int i=0; i<temp.length; i++){
            temp[i] = list.get(i);
        }
        return temp;
    }
}