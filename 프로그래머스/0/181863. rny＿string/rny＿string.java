import java.util.*;

class Solution {
    public String solution(String rny_string) {
        String answer = "";
        
        if(rny_string.contains("m")) {
            
            String[] str = rny_string.split("");
            
            List<String> list = new ArrayList<>();
            
            for(String s : str) {
                if(s.equals("m")) {
                    list.add("rn");
                } else {
                    list.add(s);
                }
            }
            
            // list를 다시 string으로
            answer = String.join("", list);
            
        } else {
            answer = rny_string;
        }
        
        return answer;
    }
}