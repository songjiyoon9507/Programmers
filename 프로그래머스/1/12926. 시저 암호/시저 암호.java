class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for(int i = 0 ; i < s.length() ; i++) {
            char ch = s.charAt(i);
            
            // 공백일 경우
            if (ch == ' ') {
                answer += ch;
                continue;
            }
            
            // ch가 소문자인 경우
            if (ch >= 'a' && ch <= 'z') {
                // 알파벳 26개 a ~ z까지
                // z 넘어가면 다시 a부터 시작하기 위해서
                answer += (char) ((ch - 'a' + n) % 26 + 'a');
            } else { // ch가 대문자인 경우
                answer += (char) ((ch - 'A' + n) % 26 + 'A');
            }
        }
        
        return answer;
    }
}