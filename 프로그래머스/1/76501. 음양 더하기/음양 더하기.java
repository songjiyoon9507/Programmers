class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int i = 0;
        for(boolean s : signs) {
            if(s) {
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }
            i++;
        }
        
        return answer;
    }
}