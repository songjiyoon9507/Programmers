import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < arr.length ; i++) {
            // 0 index 아닐 때 
            // 1일 때는 0이랑 비교 같지 않을 때만 넣어줘야함
            if(i == 0 || arr[i] != arr[i-1]  ) {
                list.add(arr[i]);
            }
        }

        return list.stream().mapToInt(i->i).toArray();
    }
}