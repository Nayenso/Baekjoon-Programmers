class Solution {
    public int solution(String binomial) {
        int index = 0, re = 0;
        for(int i = 0; i < binomial.length(); i++){
            if(binomial.charAt(i) == '*'||binomial.charAt(i) == '+'||binomial.charAt(i) == '-'){
                index = i;
                break;
            }
        }
        String a = binomial.substring(0,index-1).trim();
        String b = binomial.substring(index+1).trim();
        
        int front = Integer.parseInt(a);
        int rear = Integer.parseInt(b);
        
        switch(binomial.charAt(index)){
            case '+':
                re = front+rear;
                break;
            case '-':
                re = front-rear;
                break;
            case '*':
                re = front*rear;
                break;
        }
        return re;
    }
}