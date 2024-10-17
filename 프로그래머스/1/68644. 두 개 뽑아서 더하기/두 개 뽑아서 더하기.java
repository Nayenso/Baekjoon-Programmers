class Solution {
    public int[] solution(int[] numbers) {
        int[] num = new int[201];
        int cnt = 0;
        
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                int I = numbers[i]+numbers[j];
                if(num[I]==1){
                    continue;
                }
                num[I]++;
                cnt++;
            }
        }
        int[] re = new int[cnt];
        int index = 0;
        
        for(int i=0; i<201; i++){
            if(num[i]==1){
                re[index++] = i;
            }
        }
        return re;
    }
}