class Solution {
    public int solution(int slice, int n) {
        int i = 1;
        while(true){
            if(slice * i >= n){ 
                break;
            }
            i++;
        }
        return i;
    }
}