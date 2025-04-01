class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];
        if(arr.length % 2 == 0) {
            // 짝수일 경우 홀수 index에 n 더하기
            for(int i = 0 ; i < arr.length ; i++) {
                if(i % 2 != 0) {
                    answer[i] = arr[i] + n;
                } else {
                    answer[i] = arr[i];
                }
            }
        } else {
            // 홀수일 경우 짝수 index에 n 더하기
            for(int i = 0 ; i < arr.length ; i++) {
                if(i % 2 == 0) {
                    answer[i] = arr[i] + n;
                } else {
                    answer[i] = arr[i];
                }
            }
        }
        return answer;
    }
}