import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        // 참가 선수 participant
        // 완주 선수 completion 중 완주 못한 사람은 1명
        // 동명 이인이 있을 수 있음
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for(int i = 0 ; i < completion.length ; i++) {
            if(!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }
        
        return participant[participant.length - 1];
    }
}