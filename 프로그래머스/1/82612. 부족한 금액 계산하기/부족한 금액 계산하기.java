class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        // 원래 가격 price 처음 100 이면 다음은 200
        // N번째 이용 원래 이용의 N배 == count
        // 가진 돈 money 에서 price*1 + price*2 ...
        // 부족한 만큼이라 answer에 담아서 return
        // else(부족하지않으면 그냥 0 return)
        long total = 0;
        
        for(int i = 1 ; i <= count ; i++) {
            total += price * i;
        }

        if(total > money) {
            // 돈 부족하면
            answer = total - money;
        } else {
            answer = 0;
        }
        return answer;
    }
}