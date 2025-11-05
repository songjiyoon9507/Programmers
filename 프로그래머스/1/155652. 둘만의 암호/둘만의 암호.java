import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        // 문자 쌓아줄 거
        StringBuilder sb = new StringBuilder();
        // skip 문자열 저장
        Set<Character> skipSet = new HashSet<>();
        // String skip을 char 형태 배열로 바꿔서 향상된 for문 돌면서 skipSet에 문자 하나하나 넣어줌
        for(char c : skip.toCharArray()) {
            skipSet.add(c);
        }
        // s를 char[] 로 바꾼 다음 for문 돌면서 분기처리
        for(char c : s.toCharArray()) {
            // 다음에 올 문자 담아줄 변수
            char next = c;
            int count = 0;
            // 전달받은 index만큼 늘려줘야함
            while(count < index) {
                // 다음 문자 a -> b
                next++;
                // z 다음은 a
                if(next > 'z') next = 'a';
                // skipSet에 없는 문자만 count 증가
                if(!skipSet.contains(next)) {
                    // a 뒤에 5개 b d 빼고 h로 끝남
                    count++;
                }
            }
            // StringBuilder로 문자 쌓아주기
            sb.append(next);
        }
        answer = sb.toString();
        return answer;
    }
}