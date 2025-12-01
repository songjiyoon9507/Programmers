class Solution {
    public int solution(int hp) {
        int answer = 0;
        // 장군개미 5 병정개미 3 일개미 1
    
        while(true) {
            answer += (hp / 5); // 4 4
            hp = hp % 5; // 3 4
            
            if(hp == 0) break;
            
            answer += (hp / 3); // 1 1
            hp =  hp % 3; // 0 1
            
            if(hp == 0) break;
            
            answer += (hp / 1); // 1
            hp = hp % 1;
            
            if(hp == 0) break;
        }
        return answer;
    }
}