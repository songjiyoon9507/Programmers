import java.util.*;

class Solution {
    public int solution(int[] array) {

        Map<Integer, Integer> map = new HashMap<>();
        for(int a : array) {

            // map 에 key 가 있는지 확인
            if(map.get(a) == null) {
                // 빈 값일 때
                map.put(a, 1);
            } else {
                // 빈 값이 아닐 경우
                int num = map.get(a);
                map.put(a, num + 1);
            }

        }
        
        int maxCount = 0;
        int answer = -1;
        
        // map 을 돌면서 value 가 가장 큰 수를 찾기
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int value = entry.getKey();
            int count = entry.getValue();
            
            if(count > maxCount) {
                maxCount = count;
                answer = value;
            } else if (count == maxCount) {
                answer = -1;
            }
        }
        
        return answer;
    }
}