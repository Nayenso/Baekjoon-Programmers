class Solution {
    public int solution(String my_string) {
        String[] n = my_string.split(" ");
        int h = Integer.valueOf(n[0]);
        
        for(int i=1; i<n.length; i++){
            if(n[i].equals("+")){
                h+= Integer.valueOf(n[i+1]);
            }else if(n[i].equals("-")){
                h-= Integer.valueOf(n[i+1]);
            }
        }
        return h;
    }
}