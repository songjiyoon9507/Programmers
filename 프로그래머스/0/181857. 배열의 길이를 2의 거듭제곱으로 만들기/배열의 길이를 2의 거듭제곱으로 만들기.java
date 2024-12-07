import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0 ; i < arr.length ; i ++) {
            list.add(arr[i]);
        }
        
        int n = arr.length;
        int m = 1;
        
        while(m < n) {
            m *= 2;
        }
        
        if(list.size() != m) {
            for(int i = list.size() ; i < m ; i++) {
                list.add(0);
            }
        }
        
        return list.stream().mapToInt(x->x).toArray();
    }
}