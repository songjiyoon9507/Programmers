class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        if(slice < n) {
            // 피자 수가 사람 수보다 작을 때
            if(n % slice == 0) {
                answer = n / slice;
            } else {
                answer = n / slice + 1;
            }
        } else {
            // 피자 수가 더 많을 때
            answer = 1;
            // 한 판만 시켜도 됨
        }
        return answer;
    }
}