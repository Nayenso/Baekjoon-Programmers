class Solution {
    public int solution(String[] order) {
        int price = 0;
        for(String o : order){
            String menu = o;
            if(o.equals("iceamericano") || o.equals("americanoice") || o.equals("hotamericano")|| o.equals("americanohot") || o.equals("americano") || o.equals("anything")){
                price+=4500;
            }else if (o.equals("icecafelatte") || o.equals("cafelatteice") || o.equals("hotcafelatte")|| o.equals("cafelattehot") || o.equals("cafelatte")){
                price+=5000;
            }
        }
        return price;
    }
}