import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int temp = nums.length / 2;
        Set<Integer> set = new HashSet<>();
        for(int n : nums) {
            set.add(n);
        }
        
        if(set.size() > temp) {
            answer = temp;
        } else {
            answer = set.size();
        }
        
        return answer;
    }
}