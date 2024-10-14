class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int len = phone_number.length();
        int s = len -5;
        for(int i=0; i<len; i++){
            if(s < i && i < len){
                answer += phone_number.charAt(i);
            }else{
                answer += '*';
            }
        }
        return answer;
    }
}