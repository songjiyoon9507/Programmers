class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        
        // 좌표 범위 -100에서 100인데 계산하기 편하게 0~200으로 바꿀 거
        int[] count = new int[201];
        
        for(int[] line : lines) {
            // 좌표 범위 바뀌었으니까 기존 숫자에 100 더해줌
            int start = line[0] + 100;
            int end = line[1] + 100;
            
            // 선분을 1칸 단위로 체크
            for(int i = start ; i < end ; i++) {
                count[i]++;
            }
        }
        
        // 두 개 이상의 선분이 겹친 부분만 count해서 answer에 1씩 더해줌
        for(int c : count) {
            if(c >= 2) {
                answer++;
            }
        }
        
        return answer;
    }
}