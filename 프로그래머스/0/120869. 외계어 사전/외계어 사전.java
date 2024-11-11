class Solution {
    public int solution(String[] spell, String[] dic) {
        int cnt = spell.length;
        
        for(int i=0; i<dic.length; i++){
            int k = 0;
            for(int j=0; j<spell.length; j++){
                if(dic[i].contains(spell[j])){
                    k++;
                }
            }
            if(cnt==k){
                return 1;
            }
        }
        return 2;
    }
}