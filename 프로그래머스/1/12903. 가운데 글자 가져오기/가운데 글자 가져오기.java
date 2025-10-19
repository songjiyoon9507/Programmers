class Solution {
    public String solution(String s) {
        String answer = "";
        // substring
        int len = s.length();
        // 짝수일 경우
        if(len % 2 == 0) {
            // substring 으로 가운데 얻기
            // 4글자 index 1, 2 필요
            answer = s.substring(len/2-1, len/2+1);
        } else if(len % 2 == 1) {
            // 홀수일 경우
            // 5 글자 2로 나눴을 때 2 index
            answer = s.substring(len/2, len/2+1);
        }
        return answer;
    }
}