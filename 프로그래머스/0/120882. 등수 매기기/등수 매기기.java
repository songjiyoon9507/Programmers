class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        // 평균 매기기
        double[] avg = new double[score.length];
        for(int i = 0 ; i < score.length ; i++) {
            avg[i] = (score[i][0] + score[i][1]) / 2.0;
        }
        // 나보다 작은 점수에는 +1
        for(int i = 0 ; i < score.length ; i++) {
            int rank = 1;
            for(int j = 0 ; j < score.length ; j++) {
                if(avg[i] < avg[j]) {
                    if(avg[i] < avg[j]) {
                        rank++;
                    }
                }
            }
            answer[i] = rank;
        }
        return answer;
    }
}