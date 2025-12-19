class Solution {
    public int solution(int n) {
        int answer = 0;
        // 피자 한 판 7조각
        // 7명 이하일 때는 피자 1판
        // 사람이 더 많으면 나머지 0일 때는 몫
        // 나머지 있으면 몫 + 1
        if(n <= 7) {
            answer = 1;
        } else {
            if(n % 7 == 0) {
                answer = n / 7;
            } else {
                answer = n / 7 + 1;
            }
        }
        return answer;
    }
}