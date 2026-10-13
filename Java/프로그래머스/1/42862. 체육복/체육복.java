import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        // lost 중 여벌 있는 학생
        for(int i = 0 ; i < lost.length ; i++) {
            for(int j = 0 ; j < reserve.length ; j++) {
                if(lost[i] == reserve[j]) {
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        
        // 앞 번호 학생이 가지고 있을 때
        for(int i = 0 ; i < lost.length ; i++) {
            if(lost[i] == -1) continue;
            
            for(int j = 0 ; j < reserve.length ; j++) {
                if(lost[i] - 1 == reserve[j] ||
                   lost[i] + 1 == reserve[j]) {
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        
        for(int l : lost) {
            if(l != -1) n--;
        }
        
        int answer = n;
        return answer;
    }
}