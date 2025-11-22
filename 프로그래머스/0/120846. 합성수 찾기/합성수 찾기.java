class Solution {
    public int solution(int n) {
        int answer = 0;
        // 2부터 n까지 돌면서 3개로 나눠지는 수 찾으면 됨
        for(int i = 2 ; i <= n ; i++) {
            // 몇 번 나눠지는지 count
            int count = 0;
            for(int j = 1 ; j <= i ; j++) {
                if(i % j == 0) count++;
            }
            // count 가 3이상이면 합성수
            if(count >= 3) answer++;
        }
        return answer;
    }
}