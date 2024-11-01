class Solution {
    public int[] solution(String s) {
        int changeCnt = 0, zeroCnt = 0;
        
        while(!s.equals("1")){
            int len = s.length();
            
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) == '0'){
                    zeroCnt++;
                    len--;
                }
            }
            
            int[] arr = new int[20];
            int index = 0;
            
            while(true){
                if(len < 2){
                    arr[index++] = len;
                    break;
                }
                arr[index++] = len%2;
                len /= 2;
            }
            
            String temp="";
            for(int i=index-1; i>=0; i--){
                temp += arr[i];
            }
            changeCnt++;
            s = temp;
        }
        int[] re = {changeCnt, zeroCnt};
        return re;
    }
}