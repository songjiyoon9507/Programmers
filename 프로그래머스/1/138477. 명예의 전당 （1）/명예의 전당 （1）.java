import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        
        List<Integer> list = new ArrayList<>();
        
        // score.length 가 반복 횟수
        for(int i = 0 ; i < score.length ; i++) {
            // 7일 돌면서 list에 score 넣어줌
            list.add(score[i]);
            // list 개수가 k 이상일 때 ex) 3개 이상일 때
            if(list.size() > k) {
                // list 중에서 가장 작은 수를 remove 해줌(k개수만 남김 ex) 3)
                list.remove(Collections.min(list));
            }
            // answer에는 k개(3개) 중에 가장 작은 걸 넣어줌
            answer[i] = Collections.min(list);
        }
        return answer;
    }
}