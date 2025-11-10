class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        // 이진수 문자열을 10진수로 변환
        int b1 = Integer.parseInt(bin1, 2);
        int b2 = Integer.parseInt(bin2, 2);
        
        int sum = b1 + b2; // 두 수의 합
        // 이걸 다시 이진수 문자열로 변환
        answer = Integer.toBinaryString(sum);
        return answer;
    }
}