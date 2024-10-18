class Solution {
    public int solution(String t, String p) {
        int cnt = 0, tLen = t.length(), pLen = p.length();
        long temp = Long.parseLong(p);
        
        for(int i=0; i<=tLen-pLen; i++){
            String sTemp = "";
            sTemp = t.substring(i,i+pLen);
            Long tTemp = Long.parseLong(sTemp);
            if(temp >= tTemp){
                cnt++;
            }
        }
        return cnt;
    }
}