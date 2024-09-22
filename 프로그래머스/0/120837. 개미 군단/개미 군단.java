class Solution {
    public int solution(int hp) {
        int cnt = 0;
        int Hp = hp;
        
        while(Hp != 0){
            if(Hp >= 5){
                cnt += Hp/5;
                Hp = Hp%5;
            }else if(Hp >= 3){
                cnt += Hp/3;
                Hp = Hp%3;
            }else if(Hp >= 1){
                cnt += Hp/1;
                Hp = Hp%1;
            }
        }
        return cnt;
    }
}