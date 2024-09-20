class Solution {
    public int[] solution(int money) {
        int cnt = money/5500;
        int rest = money - 5500*cnt;
        int[] result = {cnt, rest};
        return result;
    }
}