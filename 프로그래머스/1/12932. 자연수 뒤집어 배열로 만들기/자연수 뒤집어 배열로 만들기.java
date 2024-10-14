class Solution {
    public int[] solution(long n) {
        int index = 0;
        long t = n;
        while(t>0){
            t/=10;
            index++;
        }
        String s = String.valueOf(n);
        
        char[] c = s.toCharArray();
        int[] arr = new int[index];
        int g = 0;
        for(int i=c.length-1; i>=0; i--){
            arr[g++] = (int)(c[i]-'0');
        }
        return arr;
    }
}
