class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] arr = {"aya", "ye", "woo", "ma"};
        
        for(String str : babbling) {
            for(String a : arr) {
                if(str.contains(a)) {
                    str = str.replace(a, " ");
                }
            }
            str = str.replace(" ", "");
            if(str.equals("")) {
                answer++;
            }
        }
        
        return answer;
    }
}