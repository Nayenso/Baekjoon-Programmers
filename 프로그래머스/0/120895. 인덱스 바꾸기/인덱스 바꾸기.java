class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] word = my_string.toCharArray();
        char temp = word[num1];
        word[num1] = word[num2];
        word[num2] = temp;
        
        String answer = String.valueOf(word);
        return answer;
    }
}