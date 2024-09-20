class Solution {
    public int solution(int n) {
        int a, b, r;
        if(n > 6){
            a = n;
            b = 6;
        }else{
            a = 6;
            b = n;
        }
        while(b != 0){
            r = a%b;
            a = b;
            b = r;
        }
        return (n/a);
    }
}