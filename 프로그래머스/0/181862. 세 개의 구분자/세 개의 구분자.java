class Solution {
    public String[] solution(String myStr) {
        String[] answer;
        String str = myStr.replaceAll("[a-c]", " ");
        if(str.trim().isEmpty()) {
            answer = new String[]{"EMPTY"};
        } else {
            answer = str.trim().split("\\s+");
        }
        return answer;
    }
}