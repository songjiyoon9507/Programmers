class Solution {
    public int solution(int[][] board) {
        int n = board.length;
        // 위험지역 표시 배열
        int[][] danger = new int[n][n];
        
        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < n ; j++) {
                // 지뢰 1일 때
                if(board[i][j] == 1) {
                    // 위 아래 대각선 1로 표시
                    for(int x = -1 ; x <= 1 ; x++) {
                        for(int y = -1 ; y <=1 ; y++) {
                            int nx = i + x;
                            int ny = j + y;
                            
                            // 배열 범위 벗어나면 안됨
                            if(nx >= 0 && nx < n
                              && ny >= 0 && ny < n) {
                                danger[nx][ny] = 1;
                            }
                        }
                    }
                }
            }
        }
        
        int answer = 0;
        
        // 위험 지역이 아닌 칸 계산
        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < n ; j++) {
                if(danger[i][j] == 0) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}