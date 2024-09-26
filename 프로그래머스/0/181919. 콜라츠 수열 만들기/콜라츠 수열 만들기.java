class Solution {
    public int[] solution(int n) {
        int size = 0;
        int num = n;
        while(n != 1){
            if(n%2==0){
                n /= 2;
                size++;
            }else{
                n = 3*n+1;
                size++;
            }
        }
        
        int[] answer = new int[size+1];
        answer[0] = num;
        
        int index = 1;
        while(num!=1){
            if(num%2==0){
                num /= 2;
                answer[index++] = num;
            }else{
                num = 3*num+1;
                answer[index++] = num;
            }
        }
        answer[size] = 1;
        return answer;
        
    }
}