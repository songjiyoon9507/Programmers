import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        // 오름차순 정렬
        Arrays.sort(score);
        // 7개 담겨있고 3개씩 나눠담는다면 뒤에서 1 2 3 4 5 6 7
        // 5를 담아줘야함 score[4]
        for(int i = score.length - m ; i >= 0  ; i -= m) {
            answer += score[i] * m;
            // 4 점 3개
            // 다음으로 올 수는 4 - 3 = 1 i == 1
        }
        return answer;
    }
}