class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        
        for(int i = 0 ; i < emergency.length ; i++) {
            answer[i]++;
            for(int j = 0 ; j < emergency.length ; j++) {
                if(emergency[i] < emergency[j]) {
                    // 응급도가 더 낮은 index에 +1
                    // 3 이 76 보다 작으니까 +1
                    // 24 보다 작으니까 +1
                    answer[i]++;
                }
            }
        }
        
        
        return answer;
    }
}