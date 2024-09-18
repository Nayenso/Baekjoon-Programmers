class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        char[] word = control.toCharArray();
        for(int i = 0; i < word.length; i++){
            switch(word[i]){
                case 'w':
                    n += 1;
                    break;
                case 's':
                    n -= 1;
                    break;
                case 'd':
                    n += 10;
                    break;
                case 'a':
                    n -= 10;
            }
        }
        answer = n;
        return answer;
    }
}