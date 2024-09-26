class Solution {
    public int[] solution(String myString) {
        String[] word = myString.split("x",-1);
        int[] answer = new int[word.length];
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = word[i].length();
        }
        return answer;
    }
}