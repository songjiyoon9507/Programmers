class Solution {
    public String solution(String phone_number) {
        // replaceAll 정규식
        String answer = phone_number.replaceAll(".(?=.{4})", "*");
        return answer;
    }
}