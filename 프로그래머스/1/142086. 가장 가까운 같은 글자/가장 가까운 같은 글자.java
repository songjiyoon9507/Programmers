import java.util.*;

class Solution {
    public int[] solution(String s) {
        // s 길이만큼 생김
        String[] arr = s.split("");
        int[] answer = new int[s.length()];
        // Map에 문자열을 Key로 index를 넣는다면
        // 이미 그 키가 존재할 때 index 를 꺼내서 빼줄 수 있음
        // index가 Key이면 다시 Key 값에 맞는 String (value) 값을 비교해줘야함
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0 ; i < arr.length ; i++) {
            // map 에 arr[i] 있는지 찾고 없으면 answer에 -1 넣어줌
            if(!map.containsKey(arr[i])) {
                // containsKey로 b가 있는지 없는지 확인 후 없으면 -1 넣어줌
                answer[i] = -1;
            } else {
                // 포함하고 있다면 key값으로 index 가져와 현재 index에서 빼주면 됨
                answer[i] = i - map.get(arr[i]);
            }
            // 이후에 map에 넣어줘야 다음에 비교할 수 있음
            map.put(arr[i], i);
        }
        return answer;
    }
}