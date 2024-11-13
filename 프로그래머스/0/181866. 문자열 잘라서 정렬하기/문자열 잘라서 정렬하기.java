import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] str = myString.split("x",0);
        
        List<String> list = new ArrayList<>();
        
        for(String s : str) {
            if(!s.isEmpty()) {
                list.add(s);
            }
        }
        
        String[] answer = new String[list.size()];
        list.toArray(answer);
        
        Arrays.sort(answer);

        return answer;
    }
}