class Solution {
    public int[] solution(int n, int m) {
        int[] re = new int[2];
        int a = n, b = m;
        int max = 0;
        
        while(true){
            int r = a%b;
            if(r==0){
                max = b;
                break;
            }
            a = b;
            b = r;
        }
        re[0] = max;
        re[1] = (n*m)/max;
        return re;
    }
}