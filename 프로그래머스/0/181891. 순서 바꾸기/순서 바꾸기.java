class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        
        int temp = 0;
        
        for(int i = n ; i < num_list.length ; i++) {
            answer[temp++] = num_list[i];
        }
        
        for(int j = 0 ; j < n ; j++) {
            answer[temp++] = num_list[j];
        }
        
        return answer;
    }
}