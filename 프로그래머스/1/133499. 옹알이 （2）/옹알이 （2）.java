class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] arr = {"aya", "ye", "woo", "ma"};
        for(String s : babbling) {
            // 바로 이전 문자 담아줄 변수
            String before = "";
            boolean flag = true;
            
            // 빈 문자열이 아닐 경우
            while(!s.isEmpty()) {
                boolean find = false;
                
                // 가능한 발음 배열을 돌면서
                for(String a : arr) {
                    // 해당 발음으로 시작하는지 체크
                    if(s.startsWith(a)) {
                        if(a.equals(before)) {
                            // 이전 발음이랑 같을 경우는 발음 안됨
                            flag = false;
                            break;
                        }
                        before = a;
                        // 찾은 문자는 제거
                        s = s.substring(a.length());
                        find = true;
                        // s가 빈문자열 될때까지 반복
                        break;
                    }
                }
                if(!find || !flag) {
                    flag = false;
                    break;
                }
            }
            if(flag) answer++;
        }
        
        return answer;
    }
}