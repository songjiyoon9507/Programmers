import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for(String str : intStrs) {
            int temp = Integer.parseInt(str.substring(s, s+l));
            if(temp > k) {
                list.add(temp);
            }
        }
        
        answer = list.stream().mapToInt(i->i).toArray();
        
        return answer;
    }
}