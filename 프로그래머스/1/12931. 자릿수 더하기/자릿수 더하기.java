import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = n + "";
        String[] arr = str.split("");
        
        for(String a : arr) {
            answer += Integer.parseInt(a);
        }

        return answer;
    }
}