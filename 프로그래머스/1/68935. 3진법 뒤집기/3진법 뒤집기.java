class Solution {
    public int solution(int n) {
        int answer = 0;
        // 45를 3으로 나눠서 몫이랑 나머지
        String str = "";
        while(n != 0) {
            str += String.valueOf(n%3);
            // sb.append(String.valueOf(n%3));
            n /= 3;
        }
        // answer = Integer.valueOf(str);
        return Integer.parseInt(str, 3);
    }
}