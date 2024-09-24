class Solution {
    public int solution(int[] numbers, int n) {
        int total = 0;
        int i = 0;
        while(total<=n){
            total+=numbers[i++];
        }
        return total;
    }
}