class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int size = 0;
        for(int i = 0; i<finished.length; i++){
            if(finished[i] == false){
                size++;
            }
        }
        
        String[] answer = new String[size];
        int index = 0;
        for(int i = 0; i < finished.length; i++){
             if(finished[i] == false){
                answer[index++] = todo_list[i];
            }
        }
        return answer;
    }
}