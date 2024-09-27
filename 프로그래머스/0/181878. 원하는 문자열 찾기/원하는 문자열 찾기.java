class Solution {
    public int solution(String myString, String pat) {
        String mString = myString.toLowerCase();
        String pat2 = pat.toLowerCase();
        
        if(mString.contains(pat2)){
            return 1;
        }else{
            return 0;
        }
    }
}