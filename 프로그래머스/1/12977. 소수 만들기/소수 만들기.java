class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        // 123 124 234
        // 3개 더한 걸 list 넣기
        for(int i = 0 ; i < nums.length - 2; i++) {
            for(int j = i+1 ; j < nums.length - 1 ; j++) {
                for(int k = j + 1 ; k < nums.length ; k++) {
                    // 3개를 합한 수
                    int sum = nums[i] + nums[j] + nums[k];
                    // 소수인지 함수 호출
                    if(primeNumber(sum)) {
                        // 소수라면 answer + 1
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
    // 어제 풀었던 소수 구하기 함수
    private boolean primeNumber(int n) {
        if(n < 2) return false;
        // 1은 소수가 아님 음수도 소수 아님
        for(int i = 2 ; i * i <= n ; i++) {
            // 소수이면 제곱근 아래 숫자에서 나눠지는 수가 없음(그래야 뒤에도 짝이 없음)
            if(n % i == 0) return false;
        }
        // 나눠지는 수 없으면 소수
        return true;
    }
}