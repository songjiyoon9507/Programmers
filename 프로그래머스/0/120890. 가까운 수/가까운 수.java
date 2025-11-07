class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        int min = Math.abs(n - array[0]); // 절대값

        for(int i = 1 ; i < array.length ; i++) {
            int minus = Math.abs(n - array[i]);
            if(minus < min) {
                min = minus;
                answer = array[i];
            } else if(minus == min && array[i] < answer) {
                // 차이가 같은 경우 더 작은 수
                answer = array[i];
            }
            
        }
        
        return answer;
    }
}