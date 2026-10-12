class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        
        // 0이 아닌 번호와 로또 번호 일치하는 개수
        // -> 최저 순위
        // 0인 번호가 다른 번호와 다 일치할 경우 최고 순위
        // 같은 번호가 존재하면 win_nums 의 해당 행을 -1로
        // 일치하는 번호 수
        int cor = 0;
        int min = 0;
        int max = 0; 
        for(int i = 0 ; i < win_nums.length ; i++) {
            for(int j = 0 ; j < lottos.length ; j++) {
                if(win_nums[i] == lottos[j]) {
                    cor++;
                    win_nums[i] = -1;
                }
            }
        }
        // 최저
        max = rank(cor);
        
        // lottos 가 0인 번호가 모두 win_nums 가 -1 이 아닌 수와 맞다면 최고 등수
        int zeroCount = 0;
        for(int i = 0 ; i < lottos.length ; i++) {
            if(lottos[i] == 0) {
                zeroCount++;
            }
        }
        
        cor += zeroCount;
        // 최고
        min = rank(cor); 
        
        int[] answer = {min, max};
        return answer;
    }
    
    // 일치하는 번호 개수에 따른 순위 함수
    public int rank(int a) {
        switch(a) {
            case 6 : return 1;
            case 5 : return 2;
            case 4 : return 3;
            case 3 : return 4;
            case 2 : return 5;
            default : return 6;
        }
    }
}