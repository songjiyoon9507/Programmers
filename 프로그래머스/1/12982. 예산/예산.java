import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        // 오름차순 정렬
        Arrays.sort(d);
        int total = 0;
        for(int a : d) {
            total += a;
            // 1 2 3 4일 때 6+4 10
            
            if(total > budget) {
                // 예산보다 커진 순간
                // 10 > 9
                total -= a;
                break;
            }
            // 1 2 3일때 더해지고 4일 때 break;로 안 더해짐
            answer++;
        }
        
        return answer;
    }
}