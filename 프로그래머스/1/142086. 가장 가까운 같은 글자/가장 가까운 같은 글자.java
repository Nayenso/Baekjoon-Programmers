class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        answer[0] = -1;
        
        for(int i=1; i<s.length(); i++){
            int index = -1;
            for(int j=0; j<i; j++){
                int max = 0;
                if(s.charAt(i) == s.charAt(j)){
                    index = i-j;
                }
            }
            answer[i] = index;
        }
        return answer;
    }
}