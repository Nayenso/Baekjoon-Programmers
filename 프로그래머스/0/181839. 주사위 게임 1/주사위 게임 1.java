class Solution {
    public int solution(int a, int b) {
        int score = 0;
        if((a%2 != 0)&&(b%2!=0)){
            score += a*a + b*b;
        }else if((a%2 == 0)&&(b%2==0)){
            int re = a - b;
            if(re < 0){
                re *= -1;
            }
            score += re;
        }else{
            score += 2*(a+b);
        }
        return score;
    }
}