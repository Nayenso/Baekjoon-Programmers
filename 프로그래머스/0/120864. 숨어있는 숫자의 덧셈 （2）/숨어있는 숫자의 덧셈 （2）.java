class Solution {
    public int solution(String my_string) {
        int num = 0;
        
        for(int i=0; i<my_string.length();){
            int cnt = 0;
            String temp = "";
            if('0' <= my_string.charAt(i) && my_string.charAt(i) <= '9'){
                for(int j=i; j<my_string.length(); j++){
                    if('0' <= my_string.charAt(j) && my_string.charAt(j) <= '9'){
                        temp += my_string.charAt(j);
                        cnt++;
                    }else{
                        break;
                    }
                }
                num += Integer.parseInt(temp);
                i+=cnt;
            }else{
                i++;
            }
        }
        return num;
    }
}