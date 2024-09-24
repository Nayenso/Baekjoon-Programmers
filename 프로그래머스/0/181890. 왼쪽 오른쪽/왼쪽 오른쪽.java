class Solution {
    public String[] solution(String[] str_list) {
        int indexL = -1;
        int indexR = -1;
        int flag = 0;
        
        for(int i = 0; i < str_list.length; i++){
            if(str_list[i].equals("l")){
                indexL = i;
                flag = 1;
                break;
            }
            if(str_list[i].equals("r")){
                indexR = i;
                flag = 2;
                break;
            }
        }
        if(indexL == -1 && indexR == -1){
            String[] empty = new String[0];
            return empty;
        }
        
        String[] answer;
        
        if(flag == 1){
            answer = new String[indexL];
            for(int i = 0; i < indexL; i++){
            answer[i] = str_list[i];
            }
        }
        else{
            answer = new String[str_list.length-indexR-1];
            for(int i = indexR+1; i < str_list.length; i++){
            answer[i-indexR-1] = str_list[i];
            }
        }
        return answer;
    }
}