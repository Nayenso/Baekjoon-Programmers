class Solution {
    public int solution(int[] box, int n) {
        int g = 0, s = 0, h = 0;
        h = box[2] / n;
        g = box[0] / n;
        s = box[1] / n;
        return h*g*s;
    }
}