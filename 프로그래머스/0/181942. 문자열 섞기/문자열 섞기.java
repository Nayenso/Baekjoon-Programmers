class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        char[] st1 = str1.toCharArray();
        char[] st2 = str2.toCharArray();
        
        for(int i = 0; i < st1.length; i++){
            answer += Character.toString(st1[i]);
            answer += Character.toString(st2[i]);
        }
        
        return answer;
    }
}