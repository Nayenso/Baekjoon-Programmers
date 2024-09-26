class Solution {
    public int solution(int a, int b) {
        String numA = String.valueOf(a);
        String numB = String.valueOf(b);
        String mix = numA + numB;
        int n1 = 0;
        for(int i =0; i < mix.length(); i++){
            n1 *= 10;
            n1 += mix.charAt(i) - '0';
        }
        int n2 = 2*a*b;
        
        return (n1 > n2)?n1:n2;
    }
}