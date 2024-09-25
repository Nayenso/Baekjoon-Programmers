class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0, index = 0;
        int flag = 0;
        
         if (is_suffix.length() > my_string.length()) {
            return 0;
        }
        
        int start = my_string.length() - is_suffix.length();
        
        for(int i = start; i <  my_string.length(); i++){
            if(my_string.charAt(i) == is_suffix.charAt(index++)){
                flag = 1;
            }else{
                flag = 0;
            }
        }
        
        if(flag == 1){
            return 1;
        }           
        return 0;
    }
}