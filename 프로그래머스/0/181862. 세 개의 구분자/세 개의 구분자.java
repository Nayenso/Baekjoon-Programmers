class Solution {
    public String[] solution(String myStr) {
        String[] answer = myStr.trim().split("a|b|c");
        int cnt = 0;
        for(String s : answer){
            if(!s.equals("")){
                cnt++;
            }
        }
        if(cnt==0){
            String[] em = {"EMPTY"};
            return em;
        }
        
        String[] re = new String[cnt];
        int index = 0;
        
        for(int i=0; i<answer.length; i++){
            if(answer[i].equals("")){
                continue;
            }else{
                re[index++] = answer[i];
            }
        }
        return re;
    }
}