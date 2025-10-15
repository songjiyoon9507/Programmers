class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        
        if(s.length() == 4 || s.length() == 6) {
            // 정규식표현으로 찾기
            // 문자열 시작부터 끝까지 숫자로만 돼있는지
            answer = s.matches("(^[0-9]*$)");       
        }
        return answer;
    }
}