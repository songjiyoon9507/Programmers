class Solution {
    public int solution(int chicken) {
        int answer = 0;
        // 쿠폰을 열 장 모으면 치킨 한마리
        while(chicken >= 10) {
            answer += chicken / 10;
            chicken = chicken / 10 + chicken % 10;
        }
        return answer;
    }
}