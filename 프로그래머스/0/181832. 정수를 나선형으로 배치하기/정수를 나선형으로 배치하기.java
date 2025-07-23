class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        int num = 1; // 배열에 들어갈 수
        int rs = 0; // 행 시작
        int re = n-1; // 행 마지막
        int cs = 0; // 열 시작
        int ce = n-1; // 열 마지막
        
        while(num <= n*n) {
            for(int i = cs ; i <= ce ; i++) {
                answer[rs][i] = num++;
                // 행이 0일 때 첫번째 열부터 마지막 열까지 num 하나씩 늘려가면 넣어줌 오른쪽으로 이동
            }
            rs++; // 행 증가
            
            for(int i = rs ; i <= re ; i++) {
                answer[i][ce] = num++;
                // 1행부터 마지막 행의 마지막 열 num 하나씩 늘려가며 넣어줌 아래로 이동
            }
            ce--; // 마지막 열 다 채웠으니 -1
            
            for(int i = ce ; i >= cs ; i--) {
                // n-2가 된 마지막 열에서 시작 열까지
                answer[re][i] = num++;
                // 마지막 행에서 열이 작아지면서 num 하나씩 늘려가며 넣어줌
                // 왼쪽으로 이동
            }
            re--;
            // 마지막 행도 다 채웠으니 -1
            for(int i = re ; i >= rs ; i--) {
                // n-2가 된 행에서부터 첫번째 + 1 행까지
                answer[i][cs] = num++;
                // 시작 열에서 행이 작아지면서 num 하나씩 늘려가며 넣어줌
                // 위로 이동
            }
            cs++;
            // 첫번째 열 다 찾으니 cs+1
            // 반복하면 꽉 채워짐
        }
        
        return answer;
    }
}