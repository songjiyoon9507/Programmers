import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        // list에 담아서 sort 해줄 거
        List<String> list = new ArrayList<>();
        
        // strings 를 돌면서 list에 n 번째 인덱스를 제일 앞에 붙여서 넣어줌
        for(int i = 0 ; i < strings.length ; i++) {
            list.add(strings[i].charAt(n) + strings[i]);
        }
        
        // 오름차순 정렬
        Collections.sort(list);
        // list 돌면서 answer에 맨 앞자리 자른 걸 넣어서 돌려줌
        for(int i = 0 ; i < list.size() ; i++) {
            answer[i] = list.get(i).substring(1);
        }
        
        return answer;
    }
}