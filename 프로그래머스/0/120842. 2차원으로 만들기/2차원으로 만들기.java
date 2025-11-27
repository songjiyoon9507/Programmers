class Solution {
    public int[][] solution(int[] num_list, int n) {
        // num_list 길이 8 [4][2]
        int len = num_list.length;
        int[][] answer = new int[len/n][n];
        int idx = 0;
        for(int i = 0 ; i < answer.length ; i++) {
            for(int j = 0 ; j < n ; j++) {
                answer[i][j] = num_list[idx];
                idx++;
            }
        }
        return answer;
    }
}