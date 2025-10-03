class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] arr = new int[10];
        // 0 부터 9까지 체크할 배열
        for(int i = 0 ; i < numbers.length ; i++) {
            // 전달받은 배열을 돌면서
            // numbers의 숫자가 arr의 index 번호와 같으므로 +1로 체크
            arr[numbers[i]]++;
        }
        
        for(int i = 0 ; i < arr.length ; i++) {
            // 체크한 배열을 돌면서 초기화된 배열인
            // 0 일 경우 그 index를 answer에 더해서 돌려주면 됨
            if(arr[i] == 0) {
                answer += i;
            }
        }
        return answer;
    }
}