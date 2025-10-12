class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        // split 1 + 0  == 1
        String str = x + "";
        String[] arr = str.split("");
        
        int total = 0;
        
        for(String a : arr) {
            total += Integer.parseInt(a);
        }
        
        if(x % total == 0) {
            answer = true;
        } else {
            answer = false;
        }
        
        return answer;
    }
}