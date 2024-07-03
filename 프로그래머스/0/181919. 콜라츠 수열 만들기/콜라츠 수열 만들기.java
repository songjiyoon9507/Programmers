import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        list.add(n);
        while(n != 1) {
            int size = list.size();
            if(n%2==0) {
                n /= 2;
            } else {
                n = 3*n+1;
            }
            list.add(n);
        }
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}