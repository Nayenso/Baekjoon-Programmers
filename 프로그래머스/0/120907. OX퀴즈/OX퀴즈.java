class Solution {
    public String[] solution(String[] quiz) {
        int size = quiz.length;
        String[] temp = new String[size];
        
        for(int i=0; i<size; i++){
            int t = 0;
            String[] q = quiz[i].split(" ");
            int a = Integer.parseInt(q[0]);
            int b = Integer.parseInt(q[2]);
            if(q[1].equals("+")){
                t = a+b;
            }else{
                t = a-b;
            }
            if(t==Integer.parseInt(q[4])){
                temp[i]="O";
            }else{
                temp[i]="X";
            }
        }
        return temp;
    }
}