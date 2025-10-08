class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        // 기사번호 number(까지의 약수) limit 제한 power 제한 당하면 사용할 무기
        // 사용하는 무기는 공격력 당 1kg
        // 주어진 number까지
        for(int i = 1 ; i <= number ; i++) {
            // 약수
            int count = 0;
            // 반만 돌아서 세트니까 += 2를 해줌
            for(int j = 1 ; j * j <= i ; j++) {
                if(i % j == 0) {
                    if(j * j == i) {
                        // 제곱수이면 약수 1번만 들어감
                        count++;
                    } else {
                        count += 2;
                    }
                    
                }
            }
            // 1일때 1 2일 때 2 3일 때 2...
            // count에 담김(약수 개수)
            if(count > limit) {
                count = power;
            }
            // 약수 개수가 넘치면 제한된 수치로 넣고 더해줌
            // 철의 무게
            answer += count;
        }
        return answer;
    }
}