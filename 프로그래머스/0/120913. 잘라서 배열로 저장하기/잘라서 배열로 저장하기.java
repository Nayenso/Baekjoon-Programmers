class Solution {
    public String[] solution(String my_str, int n) {
        int len = my_str.length();
        int size = len/n;
        if(len%n>0){
            size++;
        }
        
        String[] arr = new String[size];
        
        int t = 0;
        
        for(int i=0; i<size; i++){
            String temp = "";
            if(t+n<=len){
                arr[i] = my_str.substring(t,t+n);
            }else{
                arr[i] = my_str.substring(t);
            }
            t+=n;
        }
        return arr;
    }
}