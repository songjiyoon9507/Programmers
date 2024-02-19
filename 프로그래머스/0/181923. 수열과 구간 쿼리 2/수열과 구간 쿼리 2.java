import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        Arrays.fill(answer, Integer.MAX_VALUE);
        for (int i = 0 ; i < queries.length ; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            for (int j = s ; j <= e ; j++) {
                if(arr[j] > k) {
                    if(answer[i] > arr[j]) {
                        answer[i] = arr[j];
                    }
                }
            }
            if(answer[i] == Integer.MAX_VALUE) {
                answer[i] = -1;
            }
        }
        return answer;
    }
}