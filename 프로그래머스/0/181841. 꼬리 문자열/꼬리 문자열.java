import java.util.*;

class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        List<String> list = new ArrayList<>();
        for(String str : str_list) {
            list.add(str);
            if(str.contains(ex)) {
                list.remove(str);
            }
        }
        answer = String.join("",list);
        return answer;
    }
}