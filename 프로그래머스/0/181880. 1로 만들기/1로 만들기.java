class Solution {
    public int solution(int[] num_list) {
        int answer = 0; // 카운트 횟수
        
        // 배열 전체를 돌면서
        for(int i = 0 ; i < num_list.length ; i++) {
            
            while(num_list[i] != 1) {
                
                // 짝수일 때
                if(num_list[i] % 2 == 0) {
                    num_list[i] /= 2;
                    answer++;
                } else {
                    num_list[i] = (num_list[i] - 1) / 2;
                    answer++;
                }
            
            }
            
        }

        return answer;
    }
}