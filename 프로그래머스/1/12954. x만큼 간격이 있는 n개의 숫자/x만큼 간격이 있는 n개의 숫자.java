import java.util.List;
import java.util.ArrayList;

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = {};
        
        List<Long> list = new ArrayList<>();
        long xL = x;
        while(list.size() < n) {
            
            list.add(xL);
            xL += x;
        }
        
        return list.stream().mapToLong(Long::longValue).toArray();
    }
}