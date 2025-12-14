class Solution {
    public int[] solution(int[] num_list) {
        int len = num_list.length;
        int[] answer = new int[len];
        int idx = 0;
        for(int i = len - 1 ; i >= 0 ; i--) {
            answer[idx] = num_list[i];
            idx++;
        }
        return answer;
    }
}