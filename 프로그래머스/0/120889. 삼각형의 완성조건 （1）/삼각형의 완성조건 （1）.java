import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        // 가장 긴 변의 길이는 다른 두변의 길이의 합보다 작아야함(당연함)
        Arrays.sort(sides); // 오름차순 정렬
        if(sides[0] + sides[1] > sides[2]) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }
}