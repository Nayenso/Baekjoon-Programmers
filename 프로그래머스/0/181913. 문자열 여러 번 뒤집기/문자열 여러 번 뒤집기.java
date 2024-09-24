class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        
        char[] string = my_string.toCharArray();
        int i = 0;
        
        while(true){
            if(i >= queries.length){
                break;
            }
            int start = queries[i][0];
            int end = queries[i][1];
            while(start < end){
                char word = string[start];
                string[start] = string[end];
                string[end] = word;
                start++;
                end--;
            }
            i++;
        }
        for(int j = 0; j < string.length; j++){
            answer += string[j];
        }
        return answer;
    }
}