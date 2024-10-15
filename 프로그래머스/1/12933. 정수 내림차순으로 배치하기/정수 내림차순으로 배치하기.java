class Solution {
    public long solution(long n) {
        String value = String.valueOf(n);
        char[] num = value.toCharArray();
        
        for(int i=0; i<num.length-1; i++){
            for(int j=i+1; j<num.length; j++){
                if(num[i] < num[j]){
                    char temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        value = String.valueOf(num);
        return (Long.parseLong(value));
    }
}