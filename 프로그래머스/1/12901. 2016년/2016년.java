class Solution {
    public String solution(int a, int b) {
        int sum = 0;
                  // 1   2   3   4   5   6   7   8   9   10  11  12
        int[] day = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] weekend = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        
        for(int i=0; i<a-1; i++){
            sum += day[i];
        }
        sum+=b;
        int index = sum%7;
        if(index == 0){
            return "THU";
        }else{
            return weekend[index-1];
        }
    }
}