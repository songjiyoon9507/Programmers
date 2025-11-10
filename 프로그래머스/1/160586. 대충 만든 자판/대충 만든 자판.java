class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        // 아무렇게나 만든 핸드폰 자판
        // 핸드폰 자판 개수는 1부터 100까지 있을 수 있음
        // keymap [abacd, ..., ... ]
        // 길이는 다 다를 수 있음 keymap의 i가 string
        // .length() 다 다름 + 알파벳 대문자로만
        // 최소 몇 번
        for(int i = 0 ; i < targets.length ; i++) {
            int sum = 0;
            boolean flag= true;
            for(int j = 0 ; j < targets[i].length() ; j++) {
                // 처음 A
                char c = targets[i].charAt(j);
                int min = 101; // 최대 100까지 있음 index가
                // abacd 돌면서
                for(int k = 0 ; k < keymap.length ; k++) {
                    // keymap에서 A를 찾음
                    int idx = keymap[k].indexOf(c);
                    if(idx != -1) {
                        // 문자가 존재할 때 최소값 담아줌
                        min = Math.min(min, idx + 1);
                    }
                }
                
                if(min == 101) {
                    // 문자 못 찾았을 때
                    flag = false;
                    break;
                } else {
                    // 찾은 최소 index 더해줌
                    sum += min;
                }
            }
            // 문자 못찾으면 -1 넣고 true이면 index 더한 값 넣어줌
            answer[i] = flag ? sum : -1;
        }
        return answer;
    }
}