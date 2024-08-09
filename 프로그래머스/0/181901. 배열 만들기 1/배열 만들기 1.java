class Solution {
    public int[] solution(int n, int k) {
        int answerLength = n / k;
        int[] answer = new int[answerLength];
        for (int i = 0; i < answerLength ; i++) {
            answer[i] = k * (i + 1);
        }
        return answer;
    }
}