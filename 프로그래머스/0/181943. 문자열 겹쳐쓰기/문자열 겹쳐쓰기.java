class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        int cnt = 0;
        char[] mystring = my_string.toCharArray();
        char[] overwrite = overwrite_string.toCharArray();
        
        for (int i = 0; i < mystring.length; i++){
             if (i >= s && i < s + overwrite_string.length()) {
                answer += Character.toString(overwrite[i - s]);
            } else {
                answer += Character.toString(mystring[i]);
            }
        }
        return answer;
    }
}