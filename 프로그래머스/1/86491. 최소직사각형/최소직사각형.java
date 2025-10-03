class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        // sizes를 돌면서 (명함 장수)
        // 5장 중에 가로 세로 값을 담아준 다음
        // 60 50
        // 가로를 더 큰 값으로 두고
        // 70 30 무조건 이런식으로
        // 가로 중에 제일 큰 값, 세로 중에 가장 큰 값을 찾아서
        // 둘이 비교하자면 70 50
        // 둘을 곱해서 return
        int widthMax = 0; // 가로 중 max값 담을 곳
        int heightMax = 0; // 세로 중 max값 담을 곳
        for(int i = 0 ; i < sizes.length ; i++) {
            // ex 5장을 돌면서
            int width = 0;
            int height = 0;
            
            width = Math.max(sizes[i][0], sizes[i][1]);
            // 배열로 받은 가로 세로 중 더 큰 값을 width에 넣어줌
            height = Math.min(sizes[i][0], sizes[i][1]);
            // 가로 세로 중 더 작은 값을 세로에 담은 다음에
            // Max 값 담는 변수에 가로 Max 담아줌
            widthMax = Math.max(widthMax, width);
            // 세로 Max 담아줌
            // 처음엔 0이랑 50 비교 max 50들어감
            // 다음엔 50이랑 30비교해서 50 그대로 다음은 30이랑 비교 다음 40이랑 비교
            heightMax = Math.max(heightMax, height);
        }
        
        answer = widthMax * heightMax;
        
        return answer;
    }
}