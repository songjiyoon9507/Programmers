class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        String str = s.toLowerCase();
        String[] arr = str.split("");
        int p = 0;
        int y = 0;

        for(String a : arr) {
            if(a.equals("p")) p++;
            else if(a.equals("y")) y++;
        }
        
        if(p == 0 && y == 0) answer = true;
        else if(p == y) answer = true;
        else answer = false;

        return answer;
    }
}