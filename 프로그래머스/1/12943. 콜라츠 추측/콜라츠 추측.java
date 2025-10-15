class Solution {
    public int solution(int num) {
        int answer = 0;
        if(num == 1) {
            answer = 0;
        } else {
            // 반복 횟수 
            while(num != 1) {
                if(num % 2 == 0) {
                    // 짝수일 때
                    num /= 2;
                } else if(num % 2 == 1) {
                    // 홀수일 때
                    num = (num * 3) + 1;
                }
                answer++;
                if(answer == 500) {
                    return -1;
                }
            }
        }
        return answer;
    }
}