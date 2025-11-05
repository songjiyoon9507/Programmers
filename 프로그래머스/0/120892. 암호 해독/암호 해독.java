class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        // 암호화된 문자열 cipher code의 배수번째
        // 2 이면 2 4 6 ... 글자만 진짜 암호
        StringBuilder sb = new StringBuilder();
        int num = 1;
        for(int i = code ; i <= cipher.length() ; i = code*num) {
            num++;
            sb.append(cipher.charAt(i-1));
        }
        answer = sb.toString();
        return answer;
    }
}