class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int last = 0;
        
        // 배열을 돌면서
        for(int s : section) {
            if(s > last) {
                // 2가 아직 안 칠해졌으면
                // 한번 칠하고
                answer++;
                // m칸 만큼 칠해줌
                last = s + m - 1;
                // 5로 넘어감 다시 돌면서 last가 5보다 클 때 6일 때 다시 칠해줌
                // 마지막1 2 3 4도 한칸씩이니까 칠해서 넘어감
            }
        }
        
        
        return answer;
    }
}