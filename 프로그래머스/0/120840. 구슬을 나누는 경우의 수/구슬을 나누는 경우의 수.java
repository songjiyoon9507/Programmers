class Solution {
    public long solution(int balls, int share) {
        long answer = 1;
        // 5 개 중 3 개의 경우의 수
        // 5 4 3 2 1
        // 2 1 * 3 2 1
        // 3 2 1 약분되면 5 * 4 / 2 * 1 이 됨
        // (5 - 3) 이랑 3 중에 큰 수를 분자에서 나눠서 없애주면 됨
        // 큰 수는 약분된다고 치고 작은 (n - m) 과 m 중 작은 수를 골라줌(남는 수)
        int min = Math.min(balls - share, share);
        // 5 부터 작아지면서 2개
        // 2 부터 2개 10개 중 3개라면
        // 10 9 8 7 6 5 4 3 2 1
        // 7 6 5 4 3 2 1 * 3 2 1
        // 10 9 8 / 3 2 1 만 남음 3개 min이 개수임

        for(int i = 1 ; i <= min ; i++) {
            answer = answer * (balls - i + 1) / i;
        }

        return answer;
    }
}