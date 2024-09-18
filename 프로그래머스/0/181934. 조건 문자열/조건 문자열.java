class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        char a = ineq.charAt(0);
        char b = eq.charAt(0);
        
        if(n >= m && a == '>' && b == '='){
            answer = 1;
        } else if(n <= m && a == '<' && b == '='){
            answer = 1;
        } if(n > m && a == '>' && b == '!'){
            answer = 1;
        } if(n < m && a == '<' && b == '!'){
            answer = 1;
        }
        return answer;
    }
}