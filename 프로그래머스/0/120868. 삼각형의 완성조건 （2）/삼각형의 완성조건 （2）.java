class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        // 1, 2, x
        // 2가 가장 긴 변이라면 1 + x > 2 => x > 1
        // x가 가장 긴 변이라면 1 + 2 > x => x < 3
        // 1 < x < 3 (정수 2 가능) 1개
        // 3 - 1 - 1
        
        // 3, 6, x
        // 6이 가장 긴 변이라면 3 + x > 6 => x > 3
        // x가 가장 긴 변이라면 3 + 6 > x => x < 9
        // 3 < x < 9 (정수 4, 5, 6, 7, 8 가능)
        // 9 - 3 - 1
        
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);
        answer = (max + min) - (max - min) - 1;
        
        return answer;
    }
}