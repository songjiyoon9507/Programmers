class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int n = numbers.length;
        double sum = 0.0;
        for(int i = 0 ; i < n ; i++) {
            sum += numbers[i];
        }
        answer = sum / n;
        return answer;
    }
}