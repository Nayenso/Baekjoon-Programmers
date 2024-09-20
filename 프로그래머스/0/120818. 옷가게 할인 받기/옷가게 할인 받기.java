class Solution {
    public int solution(int price) {
        int ten = 100000, three = 300000, five = 500000;
        
        if(price >= five){
            double re = price * 0.8;
            return (int)re;
        }else if(price >= three){
            double re = price * 0.9;
            return (int)re;
        }else if(price >= ten){
            double re = price * 0.95;
            return (int)re;
        }
        return price;
    }
}