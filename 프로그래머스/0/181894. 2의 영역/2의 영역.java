import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        int first = 0;
        int last = -1;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 2) {
                first = i;
                break;
            }
        }
        
        for(int j = arr.length - 1; j >= 0; j--) {
            if(arr[j] == 2) {
                last = j;
                break;
            }
        }
        
        List<Integer> list = new ArrayList<>();
        
        if(last == -1) {
            list.add(-1);
        } else if(first == last) {
            list.add(2);
        } else {
            for(int k = first; k <= last; k++) {
                list.add(arr[k]);
            }
        }
        
        return list.stream().mapToInt(x->x).toArray();
    }
}