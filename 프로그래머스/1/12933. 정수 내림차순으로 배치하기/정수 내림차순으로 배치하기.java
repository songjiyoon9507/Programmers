import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = n + "";
        String[] arr = str.split("");
        Arrays.sort(arr, Collections.reverseOrder());
        
        StringBuilder sb = new StringBuilder();
        for(String a : arr) {
            sb.append(a);
        }
        
        return Long.parseLong(sb.toString());
    }
}