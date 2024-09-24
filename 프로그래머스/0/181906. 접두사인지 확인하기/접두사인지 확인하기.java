class Solution {
    public int solution(String my_string, String is_prefix) {        
        if(is_prefix.length() > my_string.length()){
            return 0;
        }
        if(is_prefix.length() == my_string.length()){
            if(my_string.equals(is_prefix)){
                return 1;
            }else{
                return 0;
            }
        }
        int cnt = 0;
        for (int i = 0; i < is_prefix.length(); i++){
            if(my_string.charAt(i) == is_prefix.charAt(i)){
                cnt++;
            }
        }
        
        int answer = (cnt == is_prefix.length()) ? 1:0;
        return answer;
    }
}