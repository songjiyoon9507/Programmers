class Solution {
    public String solution(String s) {
        String answer = "";
        // index 
        int idx = 0;
        // 공백없이 다 나눠서 배열에 담아줌
        String[] arr = s.split("");
        
        for(String a : arr) {
            // index는 공백을 마주치면 0으로 초기화 시켜주고 아닐 경우에는 +1 씩해줌
            idx = a.contains(" ") ? 0 : idx + 1;
            // t로 시작 idx + 1 됨
            // index를 2로 나눴을 때 나머지 0(짝수) 이면 2번째 index인 r부터임
            // t가 대문자로 바뀌어야하는데 idx 가 1
            answer += idx % 2 == 0 ? a.toLowerCase() : a.toUpperCase();
        }
        
        return answer;
    }
}