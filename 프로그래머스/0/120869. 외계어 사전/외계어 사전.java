class Solution {
    public int solution(String[] spell, String[] dic) {
        boolean flag = false;
        
        for(int i=0; i<dic.length; i++){
            int m = spell.length;
            boolean[] used = new boolean[spell.length];
            
            for(int j=0; j<dic[i].length(); j++){
                for(int k=0; k<spell.length; k++){
                    if(dic[i].charAt(j)==spell[k].charAt(0) && !used[k]){
                        used[k] = true;
                        m--;
                        break;
                    }
                }
            }
            if(m==0){
                flag = true;
                break;
            }
        }
        return flag?1:2;
    }
}