class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = n + "";
        String[] arr = str.split("");
        
        for(String num : arr) {
            answer += Integer.parseInt(num);
        }
        
        return answer;
    }
}