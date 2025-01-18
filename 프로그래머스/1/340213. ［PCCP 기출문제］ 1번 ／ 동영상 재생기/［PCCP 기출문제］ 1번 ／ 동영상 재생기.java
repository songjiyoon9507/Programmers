class Solution {
    // String -> int (문자열 시간을 초로 환산)
    public int sec(String time) {
        String[] strTime = time.split(":");
        int min = Integer.parseInt(strTime[0]);
        int sec = Integer.parseInt(strTime[1]);
        
        return min * 60 + sec;
    }
    
    // 오프닝 건너뛰기
    public int skip(int currentTime, int op_start, int op_end) {
        if(currentTime >= op_start && currentTime <= op_end) {
            return op_end;
        } else {
            return currentTime;
        }
    }
    
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        
        // 비디오 전체 시간
        int fullTime = sec(video_len);
        // 정지 위치
        int currentTime = sec(pos);
        // 오프닝 시작 시간
        int opStart = sec(op_start);
        // 오프닝 끝나는 시간
        int opEnd = sec(op_end);
        
        // 처음 멈춘 시간이 오프닝 시간에 걸쳤을 때 한번 오프닝 끝으로 보내줌
        currentTime = skip(currentTime, opStart, opEnd);
        
        // commands 배열에 따라 prev면 - 10, next + 10인데 멈춘 시간이 오프닝에 걸치면 opEnd로 보내줘야함.
        for(String c : commands) {
            // 10초 전으로 이동
            if(c.equals("prev")) {
                currentTime -= 10;
                if(currentTime < 0) {
                    currentTime = 0;
                }
            } else {
                // 10초 후로 이동
                currentTime += 10;
                if(currentTime > fullTime) {
                    currentTime = fullTime;
                }
            }
            // 이동 후 멈춘 시간이 오프닝 시간에 걸쳤을 때
            currentTime = skip(currentTime, opStart, opEnd);
        }
        
        // 숫자를 문자열로 변환
        answer = String.format("%02d:%02d", currentTime/60, currentTime%60);
        return answer;
    }
}