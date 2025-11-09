class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int num = i ; num <= j ; num++) {
            String s = num + "";
            if(s.contains(k+"")) {
                String[] arr = s.split("");
                for(String a : arr) {
                    if(a.equals(k+"")) answer++;
                }
            }
        }
        return answer;
    }
}