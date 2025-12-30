import java.util.Arrays;

class Solution {
    public int[] solution(int[] numlist, int n) {
        // comparator 사용하기 위해 Integer배열로 변환
        Integer[] answer = Arrays.stream(numlist).boxed().toArray(Integer[]::new);

        // 뺀 값의 부호를 보고 순서 정하는 거
        // 음수면 a 먼저, 0 이면 위치 그대로, 양수면 b 먼저
        Arrays.sort(answer, (a, b) -> {
            int diffA = Math.abs(a - n);
            int diffB = Math.abs(b - n);
            
            // 거리 기준
            if(diffA != diffB) {
                return diffA - diffB;
            }
            
            // 거리가 같으면 큰 수 먼저
            return b - a;
        });
        
        return Arrays.stream(answer).mapToInt(Integer::intValue).toArray();
    }
}