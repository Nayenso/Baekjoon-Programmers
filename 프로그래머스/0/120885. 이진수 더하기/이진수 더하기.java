class Solution {
    public String solution(String bin1, String bin2) {
        int n1 = 0, n2 = 0;
        
        for(int i=0; i<bin1.length(); i++){
            n1 = n1*2 + (bin1.charAt(i)-'0');
        }
        
        for(int i=0; i<bin2.length(); i++){
            n2 = n2*2 + (bin2.charAt(i)-'0');
        }
        
        int total = n1+n2;
        
        int[] arr = new int[20];
        int index = 0;
        String str = "";
        
        while(true){
            if(total<2){
                arr[index++] = total;
                break;
            }
            arr[index++] = total%2;
            total/=2;
        }
        
        for(int i=index-1; i>=0; i--){
            str += String.valueOf(arr[i]);
        }
        return str;
    }
}