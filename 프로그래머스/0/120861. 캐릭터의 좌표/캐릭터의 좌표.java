class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        // 왼쪽 -1 오른쪽 1 위 1 아래 -1
        // 1 0 오른쪽
        // board[i, j] 라고 할 때 최댓값
        int i = board[0] / 2;
        int j = board[1] / 2;
        for(String k : keyinput) {
            switch(k) {
                case "left" :
                    if(answer[0] > -i) answer[0]--;
                    break;
                case "right" :
                    if(answer[0] < i) answer[0]++;
                    break;
                case "up" :
                    if(answer[1] < j) answer[1]++;
                    break;
                case "down" :
                    if(answer[1] > -j) answer[1]--;
                    break;
            }
        }
        return answer;
    }
}