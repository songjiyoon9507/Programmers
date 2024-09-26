import java.util.*;

class Solution {
    public String solution(String myString) {
        String answer = "";
        
        String[] temp = new String[myString.length()];
        
        temp = myString.split("");
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0 ; i < temp.length ; i++) {
            if(temp[i].equals("a") || temp[i].equals("A")) {
                sb.append("A");
            } else {
                sb.append(temp[i].toLowerCase());
            }
        }
        
        return sb.toString();
    }
}