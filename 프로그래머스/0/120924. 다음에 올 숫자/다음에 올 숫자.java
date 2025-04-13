class Solution {
    public int solution(int[] common) {
        int answer = 0;
        // 등차수열이거나 등비수열
        if((common[1] - common[0]) == (common[2] - common[1])) {
            // 등차수열일 경우
            int temp = common[1] - common[0];
            answer = common[common.length - 1] + temp;
        } else {
            int temp = common[1] / common[0];
            answer = common[common.length - 1] * temp; 
        }
        return answer;
    }
}