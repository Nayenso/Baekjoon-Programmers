class Solution {
    public int solution(int a, int b) {
        String nA = String.valueOf(a);
        String nB = String.valueOf(b);
        String n1 = nA+nB;
        String n2 = nB+nA;
        int A = Integer.parseInt(n1);
        int B = Integer.parseInt(n2);
        if(A == B){
            return A;
        }
        return (A>B)?A:B;
        
    }
}