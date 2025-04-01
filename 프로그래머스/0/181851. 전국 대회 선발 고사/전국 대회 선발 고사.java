import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < rank.length ; i++) {
            if(attendance[i]) {
                list.add(rank[i]);
            }
        }
        // 참가 가능한 학생 번호 높은 순위부터 정렬
        Collections.sort(list);
        
        for(int i = 0 ; i < rank.length ; i++) {
            if(list.get(0) == rank[i]) {
                answer += 10000 * i;
            } else if (list.get(1) == rank[i]) {
                answer += 100 * i;
            } else if (list.get(2) == rank[i]) {
                answer += i;
            }
        }
        
        return answer;
    }
}