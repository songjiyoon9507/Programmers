class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        for(int n : num_list) {
            if(n % 2 == 0) {
                // 짝수
                answer[0] += 1;
            } else if(n % 2 == 1) {
                // 홀수
                answer[1] += 1;
            }
        }
        return answer;
    }
}