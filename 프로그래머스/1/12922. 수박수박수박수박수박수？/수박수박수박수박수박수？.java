class Solution {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        
        // 홀수에 수, 짝수에 박
        for(int i = 1 ; i <= n ; i++) {
            if(i % 2 == 0) {
                sb.append("박");
            } else {
                // i 가 0부터 시작이라 음수일 가능성 없음
                // 홀수일 때
                sb.append("수");
            }
        }
        return sb.toString();
    }
}