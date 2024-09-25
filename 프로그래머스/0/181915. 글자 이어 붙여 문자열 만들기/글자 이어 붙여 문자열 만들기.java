class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        int cnt = 0, i = 0;
        
        while(cnt < index_list.length){
            answer += my_string.charAt(index_list[i++]);
            cnt++;
        }
        return answer;
    }
}