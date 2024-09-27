class Solution {
    public int solution(String[] s1, String[] s2) {
        int len1 = s1.length, len2 = s2.length;
        int cnt = 0;
        
        if(len1 > len2){
            for(int i = 0; i < len2; i++){
                for(int j= 0; j < len1; j++){
                    if(s2[i].equals(s1[j])){
                        cnt++;
                    }
                }
            }
            return cnt;
        }else if(len1 < len2){
            for(int i = 0; i < len1; i++){
                for(int j= 0; j < len2; j++){
                    if(s1[i].equals(s2[j])){
                        cnt++;
                    }
                }
            }
            return cnt;
        }
        for(int i = 0; i < len1; i++){
            for(int j = 0; j < len2; j++){
                if(s1[i].equals(s2[j])){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}