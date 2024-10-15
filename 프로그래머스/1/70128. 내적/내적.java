class Solution {
    public int solution(int[] a, int[] b) {
        int re = 0;
        for(int i=0; i<a.length; i++){
            re+= a[i]*b[i];
        }
        return re;
    }
}