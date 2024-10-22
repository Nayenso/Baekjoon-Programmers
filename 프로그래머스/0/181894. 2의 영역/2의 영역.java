class Solution {
    public int[] solution(int[] arr) {
        int index1 = -1, index2 = -1;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]==2){
                if(index1==-1){
                    index1 = i;
                }
                index2=i;
            }
        }
        if(index1==-1){
            int[] a = {-1};
            return a;
        }
        int I=0;
        int size = index2-index1+1;
        int[] two = new int[size];
        for(int i=index1; i<=index2; i++){
            two[I++] = arr[i];
        }
        return two;
    }
}