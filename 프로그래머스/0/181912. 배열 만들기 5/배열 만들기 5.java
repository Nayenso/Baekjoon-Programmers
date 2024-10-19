class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int size = intStrs.length;
        int[] reArr = new int[size];
        int index = 0;
        
        for(int i=0; i<size; i++){
            String temp = "";
            for(int j=s; j<s+l; j++){
                temp+=intStrs[i].charAt(j);
            }
            int intTemp = Integer.parseInt(temp);
            if(k < intTemp){
                reArr[index++] = intTemp;
            }
        }
        int cnt = 0;
        for(int i=0; i<index; i++){
            if(reArr[i]==0){
                break;
            }
            cnt++;
        }
        int[] answer = new int[cnt];
        int t = 0;
        for(int i=0; i<cnt; i++){
            answer[t++] = reArr[i];
        }
        return answer;
    }
}