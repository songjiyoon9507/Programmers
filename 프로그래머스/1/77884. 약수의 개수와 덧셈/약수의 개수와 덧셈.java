class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for(int i = left ; i <= right ; i++) {
            int count = 0;
            for(int j = 1 ; j <= i ; j++) {
                if(i % j == 0) {
                    count++;
                }
            }
            if(count % 2 == 0) {
                // 약수의 개수가 짝수일 떄
                answer += i;
            } else {
                // 약수의 개수가 홀수일 때
                answer -= i;
            }
        }
        
        return answer;
    }
}