class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i = 0 ; i < quiz.length ; i++) {
            String[] str = quiz[i].split(" ");
            int f = Integer.parseInt(str[0]);
            int s = Integer.parseInt(str[2]);
            int t = Integer.parseInt(str[4]);
            if((quiz[i].contains(" + ") && (f + s == t)) || (quiz[i].contains(" - ") && (f - s == t))) {
                answer[i] = "O";
            } else {
                answer[i] = "X";
            }
        }
        
        return answer;
    }
}