import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0 ; i < arr.length ; i++) {
            int temp = arr[i];
            for(int j = 0 ; j < temp ; j++) {
                list.add(temp);
            }
        }
        
        answer = list.stream().mapToInt(x->x).toArray();
        
        return answer;
    }
}