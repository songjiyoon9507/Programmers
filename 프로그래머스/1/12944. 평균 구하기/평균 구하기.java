class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        
        int total = 0;
        
        for(int a : arr) {
            total += a;
        }
        
        answer = (double)total / arr.length;
        
        return answer;
    }
}