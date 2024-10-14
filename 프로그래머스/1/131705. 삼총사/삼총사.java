class Solution {
    public int solution(int[] number) {
        int c = 0, len = number.length;
        for(int i=0; i<len-2; i++){
            for(int j=i+1; j<len-1; j++){
                for(int t=j+1; t<len; t++){
                    if(number[i]+number[j]+number[t]==0){
                        c++;
                    }
                }
            }
        }
        return c;
    }
}