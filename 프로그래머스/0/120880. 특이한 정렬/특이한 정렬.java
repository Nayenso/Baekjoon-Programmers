class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] arr = numlist;
        boolean sort = false;
        
        do{
            sort = true;
            
            for(int i=0; i<numlist.length-1; i++){
                int s1 = n-arr[i];
                int s2 = n-arr[i+1];
                
                if(s1<0){
                    s1*=-1;
                }
                if(s2<0){
                    s2*=-1;
                }
                
                if(s1>s2){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    sort = false;
                }else if(s1==s2){
                    if(arr[i]<arr[i+1]){
                        int temp2 = arr[i];
                        arr[i] = arr[i+1];
                        arr[i+1] = temp2;
                        sort = false;
                    }
                }
            }
        }while(!sort);
        
        return arr;
    }
}