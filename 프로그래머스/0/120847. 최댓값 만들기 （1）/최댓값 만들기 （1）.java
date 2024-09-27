import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int a = numbers.length-1;
        int b = a-1;
        return (numbers[a]*numbers[b]);
    }
}