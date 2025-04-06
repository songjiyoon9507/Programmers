import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        List<Integer> delList = new ArrayList<>();
        
        for(int n : arr) {
            list.add(n);
        }
        
        for(int n : delete_list) {
            delList.add(n);
        }
        
        list.removeAll(delList);
        
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}