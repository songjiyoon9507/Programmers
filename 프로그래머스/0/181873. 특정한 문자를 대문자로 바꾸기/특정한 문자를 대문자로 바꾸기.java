import java.util.*;

class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        if(my_string.contains(alp)) {
            
            String[] temp = new String[my_string.length()];
            temp = my_string.split("");
            for(int i = 0 ; i < temp.length ; i ++) {
                if(temp[i].equals(alp)) {
                    sb.append(alp.toUpperCase());
                } else sb.append(temp[i]);
            }
            answer = sb.toString();
        } else answer = my_string;
        
        return answer;
    }
}