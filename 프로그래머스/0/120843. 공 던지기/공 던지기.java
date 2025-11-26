class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int i = 0;
        // k번 반복
        while(k != 0) {
            // 첫번째 공 넘기는 사람
            answer = numbers[i];
            k--; // k = 1
            i += 2; // i 2씩 증가
            if(i >= numbers.length) {
                // i 가 numbers.lenght 3보다 클 때
                // 3번째로 보면 i 가 3번째 일 때 i 4가 됨
                i = i - (numbers.length);
                // 4에서 3 빼면 1 index 1 = 2
            }
            
        }
        
        return answer;
    }
}