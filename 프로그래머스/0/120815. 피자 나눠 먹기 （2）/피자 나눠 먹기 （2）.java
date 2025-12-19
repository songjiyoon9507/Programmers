class Solution {
    public int solution(int n) {
        int answer = 1;
        // 피자 한 판 6조각
        // 최소공배수 찾아야함
        while ((answer * 6) % n != 0) {
            answer++;
            // 피자 1판을 사람 수로 나눴을 때 나머지가 0이 아니면 피자 한 판 더 시킴
            // 0이 될 때까지 시키면 됨
        }
        
        return answer;
    }
}