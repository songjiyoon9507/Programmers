import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        // Map key value 해서 개수 담으면?
        // 소문자 개수 배열
        int[] arr = new int[26];
        // a 아스키 코드 값 97
        for(char b : before.toCharArray()) {
            int idx = b - 97;
            arr[idx]++;
        }
        
        for(char a : after.toCharArray()) {
            int idx = a - 97;
            arr[idx]--;
        }
        
        for(int a : arr) {
            if(a > 0) {
                answer = 0;
                break;
            } else {
                answer = 1;
            }
        }
        
        return answer;
    }
}