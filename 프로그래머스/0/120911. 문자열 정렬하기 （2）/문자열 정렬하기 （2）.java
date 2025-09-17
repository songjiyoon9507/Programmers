import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = my_string.toLowerCase();
        
        String[] arr = answer.split("");
        
        Arrays.sort(arr);
        
        return String.join("", arr);
    }
}