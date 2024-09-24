class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        boolean f1, f2;
        if(x1 == false && x2 == false){
            f1 = false;
        }else{
            f1 = true;
        }
        if(x3 == false && x4 == false){
            f2 = false;
        }else{
            f2 = true;
        }
        if(f1 == true && f2 == true){
            answer = true;
        }else{
            answer = false;
        }
        return answer;
    }
}