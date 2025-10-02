import java.util.*;

class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 1 ; i < food.length ; i++) {
            // 음식 번호를 몇 번 넣어줘야할지
            // 음식 개수를 2로 나눠서 몫만큼 for문을 돌아야
            // 음식 번호를 그 개수만큼 넣어줄 수 있음
            for(int j = 0 ; j < food[i] / 2 ; j++) {
                sb.append(String.valueOf(i));
            }
        }
        
        // 오른쪽으로 똑같이 뒤집어서 붙여주기 위해서 String 복사
        String temp = sb.toString();
        // 물
        sb.append("0");
        // 왼쪽 문자열을 뒤집어서 뒤로 쌓아줌(오른쪽에 붙여줌)
        sb.append(new StringBuilder(temp).reverse());
        
        answer = sb.toString();
        
        return answer;
    }
}