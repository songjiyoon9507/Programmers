import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1];
        
        // 빈 배열이면 -1 return 10한개일 때는 10 빼면 배열 길이 0
        if(arr.length <= 1) return new int[]{-1};
        
        // list에 배열을 그대로 다 넣어준 다음
        List<Integer> list = new ArrayList<>();
        for(int a : arr) list.add(a);
        
        // Collections.min 이용해서 최솟값 찾아주기
        int min = Collections.min(list);
        // remove 이용해서 list에서 최솟값 삭제 
        list.remove(Integer.valueOf(min));
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}