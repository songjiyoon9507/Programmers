class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        
        for(int i = 0 ; i <  schedules.length ; i++) {
            // 직원이 정한 스케줄 3
            // int time = schedules[i] + 10; // 첫번째 직원이 정한 시간 700 -> 710까지
            // 분 단위로 바꿔서 계산해줘야함
            int time = transTime(schedules[i]) + 10;
            int check = 0; // 5번 이상 시간 안 어기고 출근하면 체크
            // for문에서 가능성 없는 5일 체크했는데 2일만 제대로 출근한 사람 나머지 2일 다 제대로 출근해도
            // 상품 못 받음 for문도 안돌게 멈춰주기
            for(int j = 0 ; j < timelogs[i].length && check + (timelogs[i].length - j) >= 5 ; j++) {
                // 첫번째 직원의 출근 시간이 적혀있음
                // startday 가 6 ,7 이면 그 번호는 세면 안됨
                // startday 는 +1 씩 하고 7이 넘으면 다시 1로 돌아와야함
                // startday 런타임 줄이기
                int day = (startday + j - 1) % 7 + 1;
                // 입력 받은 시간 배열도 분으로 바꿔서 비교해줘야함
                if(day < 6 && transTime(timelogs[i][j]) <= time) {
                    check++;
                    // check가 5이상일 때 종료 시켜서 for문 빠져나가기
                    if(check >= 5) {
                        break;
                    }
                }
                // 런타임
                // startday++;
                // if(startday > 7) { // 일요일 지나면 다시 월요일로 돌려줌
                //     startday = 1;
                // }

            }
            if(check >= 5) {
                answer++;
            }
        }
        return answer;
    }
    
    // 9시 55분 의 10분 후는 10시 05분 time 에 그냥 10을 더해버리면 965가 됨 10시 00분에 온사람은 지각이 아닌데
    // 지각으로 체크될 수 있음 분단위로 바꾼 다음에 계산해줘야함
    private int transTime(int time) {
        int hour = time / 100;
        int minute = time % 100;
        return hour * 60 + minute;
    }
}