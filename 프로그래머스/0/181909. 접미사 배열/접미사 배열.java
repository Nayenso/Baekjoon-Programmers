import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        int size = 0, len = my_string.length();
        for(int i = 0; i < len; i++){
            size++;
        }
        String[] answer = new String[size];
        answer[0] = String.valueOf(my_string.charAt(len-1));
        int index = 1;
        
        for(int i = len-2; i >= 0; i--){
            String temp = "";
            temp += my_string.charAt(i);
            for(int j = i+1; j < len; j++){
                temp+=my_string.charAt(j);
            }
            answer[index++] = temp;
        }
        Arrays.sort(answer);
        return answer;
    }
}