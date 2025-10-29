class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] arr = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        // 총 일수가 day에 담김
        int day = 0;
        for(int month = 1 ; month < a ; month++) {
            // 1 ~ 5월까지
            switch(month) {
                case 1, 3, 5, 7, 8, 10, 12 :
                    // 31일까지 있음
                    day += 31;
                    break;
                case 4, 6, 9, 11 :
                    day += 30;
                    break;
                case 2 : // 윤년
                    day += 29;
                    break;
                default : break;
            }
        }
        // 7로 나눈 나머지 나머지가 0이면
        // 1월 예로 들면 1월 8일이면 1이 남음
        // 금요일 (index 0)
        // 2월 1일 로 예를 들면 31 + 1 32일
        // 7로 나누면 4 남음 월요일(index 3)
        day = (day + b - 1) % 7;
        answer = arr[day];
        return answer;
    }
}