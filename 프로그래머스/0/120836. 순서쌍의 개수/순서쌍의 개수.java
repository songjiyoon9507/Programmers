class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1 ; i * i <= n ; i++) {
            // (10 * 10 == 100)
            if(n % i == 0) {
                if(i * i == n) {
                    answer += 1; // 제곱근이면 한 번만 더해줘야함
                } else {
                    // 제곱근이 아닐 때는 2번씩 더해줘야 뒤집었을 때도 계산됨
                    answer += 2;
                }
            }
        }
        
        return answer;
    }
}