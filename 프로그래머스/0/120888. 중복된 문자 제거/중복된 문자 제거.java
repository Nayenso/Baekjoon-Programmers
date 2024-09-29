class Solution {
    public String solution(String my_string) {
        char[] arr = my_string.toCharArray();
        
        for(int i = 0; i < my_string.length(); i++){
            for(int j = i+1; j < my_string.length(); j++){
                if(arr[i] == arr[j]){
                    arr[j] = '!';
                }
            }
        }
        String answer = "";
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == '!'){
                continue;
            }
            answer += arr[i];
        }
        return answer;
    }
}