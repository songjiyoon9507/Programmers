class Solution {
    public int solution(String t, String p) {
        int answer = 0;

        // substring
        // for 문을 돌 때 i가 어디까지 돌아야하냐면 t.length() - 3 까지
        for(int i = 0 ; i <= t.length() - p.length() ; i++) {
            // 시작은 원하는 숫자 끝나는 수는 다음 숫자 i + 3
            String temp = t.substring(i, i + p.length());
            if(Long.parseLong(temp) <= Long.parseLong(p)) {
                answer++;
            }
        }
        return answer;
    }
}