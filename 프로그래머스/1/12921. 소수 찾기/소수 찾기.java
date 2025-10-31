class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 2 ; i <= n ; i++) {
            // 1은 소수 아니니까 빼고 2부터 받은 n까지
            boolean flag = true;
            for(int j = 2 ; j * j <= i ; j++) {
                // i의 제곱근까지만 검사하기 5의 제곱근은 2.~몇인까 2로 안 나눠지면 그 뒤에 짝이 없음 3, 4로도 안 나눠짐 약수는 반 앞에서 다 걸림
                // 4 는 2까지 2로 나눠짐
                // 10 은 3.~몇
                // 2로 나눠짐 뒤에 5 짝이 있음 소수 아님
                if(i % j == 0) {
                    flag = false;
                    break;
                }
            }
            // flag 에 변화가 없으면 나눠지는 수가 없었던 것
            if(flag) answer++;
            // result 에 추가해줘야함
        }
        
        return answer;
    }
}