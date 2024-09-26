class Solution {
    public int[] solution(int[] num_list) {
        int[] num = new int[num_list.length];
        int[] result = new int[num_list.length-5];
        
        for(int i = 0; i < num.length; i++){
            num[i] = num_list[i];
        }
        
        for(int i = 0; i < num.length-1; i++){
            for(int j = i+1; j < num.length; j++){
                if(num[i] > num[j]){
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        int index = 0;
        
        for(int i = 5; i < num.length; i++){
            result[index++] = num[i];
        }
        return result;
    }
}