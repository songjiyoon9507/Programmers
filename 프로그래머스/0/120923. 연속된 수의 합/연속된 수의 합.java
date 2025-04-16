class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int plusNum = total / num;
        int minusNum = total / num;
        if(total % num == 0) {
            for(int i = num / 2 ; i >= 0 ; i--) {
                answer[i] = minusNum--;
            }
            for(int i = num / 2 + 1; i < num ; i++) {
                answer[i] = ++plusNum;
            }
        } else {
            for(int i = num / 2 - 1; i < num ; i++) {
                answer[i] = plusNum++;
            }
            for(int i = num / 2 - 2; i >= 0 ; i--) {
                answer[i] = --minusNum;
            }
        }
        return answer;
    }
}