class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        String color = board[h][w];
        
        // 위 h-1, 아래 h+1, 오른쪽 w+1, 왼쪽 w-1
        // 위
        if(h-1 >= 0 && board[h-1][w].equals(color)) answer++;
        // 아래
        if(h+1 < board.length && board[h+1][w].equals(color)) answer++;
        // 왼쪽
        if(w-1 >= 0 && board[h][w-1].equals(color)) answer++;
        // 오른쪽
        if(w+1 < board[h].length && board[h][w+1].equals(color)) answer++;
        
        return answer;
    }
}