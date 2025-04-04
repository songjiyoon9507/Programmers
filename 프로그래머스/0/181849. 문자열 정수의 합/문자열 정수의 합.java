class Solution {
    public int solution(String num_str) {
        int answer = 0;
        for(String num : num_str.split("")) {
            int n = Integer.parseInt(num);
            answer += n;
        }
        return answer;
    }
}