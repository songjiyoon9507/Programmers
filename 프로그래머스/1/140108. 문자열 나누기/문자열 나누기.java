class Solution {
    public int solution(String s) {
        int answer = 0;
        
        char x = s.charAt(0); // 처음 문자 담아둘 변수
        int countX = 1; // 처음 담은 b
        int countNotX = 0; // b와 다른 문자 개수
        
        for(int i = 1 ; i < s.length() ; i++) {
            // 다시 돌아와서 x에 i 1 더해지기 전에 i+1을 더해서 n 담김 i++ 돼서 돌아와서 담긴 s.charAt(i) 는  n으로 같음 countX 1이됨
            if(s.charAt(i) == x) {
                // b와 a가 같으면
                countX++;
            } else {
                // b와 a가 같지 않으면
                countNotX++;
                // b와 a는 다름 여기로 들어옴
            }
            
            if(countX == countNotX) {
                // b a 달라서 끊어줄 거
                answer++;
                // 마지막 글자 이전까지만 (index 넘기면 안됨)
                if(i + 1 < s.length()) {
                    x = s.charAt(i + 1);
                    // 기준 문자를 바꿔줘야함 n으로
                }
                countX = 0;
                countNotX = 0;
            }
        }
        
        if(countX != countNotX) {
            // for문 끝나고 숫자 안 맞아서 남은 문자
            answer++;
        }
        
        return answer;
    }
}