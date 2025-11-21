import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int i = numbers.length - 1; // 마지막 index
        int answer = numbers[i] * numbers[i - 1];
        return answer;
    }
}