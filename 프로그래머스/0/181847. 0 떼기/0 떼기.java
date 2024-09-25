class Solution {
    public String solution(String n_str) {
        String answer = "";
        int cnt = 1;
        char start = n_str.charAt(0);
        if(start == '0'){
            for(int i = 1; i < n_str.length(); i++){
                if(n_str.charAt(i) == '0'){
                    cnt++;
                    continue;
                }
                break;
            }
            for(int i = cnt; i < n_str.length(); i++){
                answer += n_str.charAt(i);
            }
        }else{
            for(int i = 0; i < n_str.length(); i++){
                answer += n_str.charAt(i);
            }
        }

        return answer;
    }
}