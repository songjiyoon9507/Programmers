class Solution {
    public int solution(int[] num_list) {
        
        String even = ""; // 짝수일 때
        String odd = ""; // 홀수일 때
        
        for (int i = 0 ; i < num_list.length ; i++) {
            if(num_list[i] % 2 == 0) { // 짝수일 때
                even += Integer.toString(num_list[i]);
            } else { // 홀수일 때
                odd += Integer.toString(num_list[i]);
            }
        }
        
        return Integer.parseInt(even) + Integer.parseInt(odd);
    }
}