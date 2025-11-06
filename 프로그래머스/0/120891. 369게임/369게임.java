class Solution {
    public int solution(int order) {
        int answer = 0;
        // 문자열
        String str = order + "";
        // 문자로 담음
        String[] arr = str.split("");
        for(String a : arr) {
            switch(a) {
                case "3", "6", "9" :
                    answer++;
                    break;
                default : break;
            }
        }

        return answer;
    }
}