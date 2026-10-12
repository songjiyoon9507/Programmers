import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        List<Integer> list = new ArrayList<>();
        int answer = 0;
        
        for(int i = 0 ; i < ingredient.length ; i++) {
            // 재료를 list 에 담아주기
            list.add(ingredient[i]);
            
            int size = list.size();
            
            // 재료가 4개 이상 쌓였을 때 햄버거 만들 수 있는지 판단
            if(size >= 4) {
                if(list.get(size-4) == 1 &&
                   list.get(size-3) == 2 &&
                   list.get(size-2) == 3 &&
                   list.get(size-1) == 1) {
                    // 햄버거 1개 완성
                    answer++;
                    // 사용한 재료는 list 에서 삭제
                    for(int j = 0 ; j < 4 ; j++) {
                        list.remove(list.size() - 1);
                    }
                }
            }
        }
        
        return answer;
    }
}