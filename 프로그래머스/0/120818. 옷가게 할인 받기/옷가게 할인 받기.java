class Solution {
    public int solution(int price) {
        int answer = 0;
        if(price >= 500000) {
            // 50만원 이상
            answer = price * 80 / 100;
        } else if(price >= 300000) {
            // 30만원 이상
            answer = price * 90 / 100;
        } else if(price >= 100000) {
            // 10만원 이상
            answer = price * 95 / 100;
        } else {
            answer = price;
        }
        return answer;
    }
}