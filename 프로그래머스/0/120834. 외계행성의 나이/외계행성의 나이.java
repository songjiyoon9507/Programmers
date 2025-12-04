class Solution {
    public String solution(int age) {
        StringBuilder answer = new StringBuilder();
        // a == 97
        // 0 == a == 0 + 97
        // 1 == b == 1 + 97
        String str = Integer.toString(age);
        for(char c : str.toCharArray()) {
            // '0' == 48
            // '2' == 50 50 - 48 해서 숫자 2 만들어준 다음
            // 'a' 더해주면 'c'
            char newChar = (char)((c - '0') + 'a');
            answer.append(newChar);
        }
        return answer.toString();
    }
}