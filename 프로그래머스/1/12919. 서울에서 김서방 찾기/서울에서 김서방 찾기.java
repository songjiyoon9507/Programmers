class Solution {
    public String solution(String[] seoul) {
        int idx = 0;

        for(String s : seoul) {
            if(s.equals("Kim")) {
                break;
            }
            idx++;
        }
        
        String answer = String.format("김서방은 %d에 있다", idx);
        return answer;
    }
}