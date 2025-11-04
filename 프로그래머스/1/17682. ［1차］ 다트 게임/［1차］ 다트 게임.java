class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        // 점수 담을 배열
        int[] score = new int[3];
        int idx = -1;
        
        for(int i = 0 ; i < dartResult.length() ; i++) {
            // 한글자씩 받아서 경우에 따라 계산
            char c = dartResult.charAt(i);
            
            // 숫자일 경우
            if(Character.isDigit(c)) {
                idx++;
                // 숫자가 두자리 수일때
                if(c == '1' && i + 1 < dartResult.length() && dartResult.charAt(i + 1) == '0') {
                    score[idx] = 10;
                    i++;
                } else {
                    score[idx] = c - '0';
                }
            } else if(c == 'S') {
                // 보너스 S 1제곱
                score[idx] = (int) Math.pow(score[idx], 1);
            } else if(c == 'D') {
                // 보너스 D 2제곱
                score[idx] = (int) Math.pow(score[idx], 2);
            } else if(c == 'T') {
                // 보너스 T 3제곱
                score[idx] = (int) Math.pow(score[idx], 3);
            } else if(c == '*') {
                // 옵션 * 2
                score[idx] *= 2;
                // 이전 점수도 2배
                if(idx > 0) score[idx - 1] *= 2;
            } else if(c == '#') {
                // 해당 점수만 -1
                score[idx] *= -1;
            }
        }
        answer = score[0] + score[1] + score[2];
        return answer;
    }
}