class Solution {
    public int solution(String myString, String pat) {
        String temp = "";
        
        for(int i = 0; i < myString.length(); i++){
            if(myString.charAt(i) == 'A'){
                temp += 'B';
            }else if(myString.charAt(i) == 'B'){
                temp += 'A';
            }
        }
        
        if(temp.contains(pat)){
            return 1;
        }else{
            return 0;
        }
    }
}