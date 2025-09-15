import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        List<String> list = new ArrayList<>();
        
        // 16글자 6글자씩 0 6 12 (3번 순환)
        for(int i = 0 ; i < my_str.length() ; i = i + n) {
            if(i + n < my_str.length()) {
                // 6부터 시작 12 18 두번째 순환까지만 여기
                list.add(my_str.substring(i, i+n));
                // 0 부터 6까지 잘라서 list에 넣어줌(1)
            } else {
                list.add(my_str.substring(i));
                // i + n == 18일 때 i == 12
                // 12부터 16까지 문자열 list에 넣어줌(3)
            }
        }
        return list.stream().toArray(String[]::new);
    }
}