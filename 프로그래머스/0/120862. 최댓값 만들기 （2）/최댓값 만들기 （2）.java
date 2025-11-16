import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        // 오름차순 정렬
        Arrays.sort(numbers);
        int n = numbers.length;
        // 가장 작은 두 수 (음수일수도 있고 아닐수도 있음)
        int res1 = numbers[0] * numbers[1];
        int res2 = numbers[n-1] * numbers[n-2];
        // 가장 큰 두 수 곱셈
        // 음수 * 음수로 가장 큰 수일수도 있어서 Math.max로 찾아서 return
        answer = Math.max(res1, res2);
        
        return answer;
    }
}