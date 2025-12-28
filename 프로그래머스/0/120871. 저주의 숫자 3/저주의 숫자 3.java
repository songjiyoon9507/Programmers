class Solution {
    public int solution(int n) {
        int answer = 0;
        // 11 - 17, 12 - 19, 13 - 20, 14 - 22, 15 - 25
        // 10진법 숫자
        int count = 0;
        
        while(count < n) {
            // 1 2 3 4 5 6 7
            answer++;
            if(answer % 3 != 0 && !String.valueOf(answer).contains("3")) {
                // 1 2 2 3 4 4 5
                count++;
                // 10진법에서 5일 때 3x 마을은 7
            }
        }
        
        return answer;
    }
}