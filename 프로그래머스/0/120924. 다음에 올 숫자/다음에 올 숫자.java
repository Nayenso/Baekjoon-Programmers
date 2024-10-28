class Solution {
    public int solution(int[] common) {
        int index = common.length-1;
        int t = -1;
        
        if((common[2]-common[1]) == (common[1]-common[0])){
            t = common[2]-common[1];
            return common[index]+t;
        }else{
            t = common[2]/common[1];
            return common[index]*t;
        }
    }
}