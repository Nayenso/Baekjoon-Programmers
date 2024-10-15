class Solution {
    public String solution(int n) {
        char f = '수', e = '박';
        String re = "";
        
        for(int i=0; i<n; i++){
            if(i%2==0){
                re += f;
            }else{
                re += e;
            }
        }
        return re;
    }
}