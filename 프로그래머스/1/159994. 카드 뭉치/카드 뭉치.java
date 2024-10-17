class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String[] temp = new String[goal.length];
        int index1 = 0, index2 = 0, cnt = 0;
        
        for(int i=0; i<goal.length; i++){
            if(index1 < cards1.length && cards1[index1].equals(goal[i])){
                temp[i] = cards1[index1];
                cnt++;
                index1++;
            }else if(index2 < cards2.length && cards2[index2].equals(goal[i])){
                temp[i] = cards2[index2];
                cnt++;
                index2++;
            }
        }
        
        if(cnt == goal.length){
            return "Yes";
        }else{
            return"No";
        }
    }
}