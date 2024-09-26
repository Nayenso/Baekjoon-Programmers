class Solution {
    public String[] solution(String my_string) {
        String[] temp = my_string.split(" ");
        int size = 0;
        
        for(int i = 0; i < temp.length; i++){
            if(!temp[i].equals("")){
                size++;
            }
        }
        int index = 0;
        
        String[] result = new String[size];
        for(int i = 0; i < temp.length; i++){
            if(!temp[i].equals("")){
                result[index++] = temp[i];
            }
        }
        return result;
    }
}