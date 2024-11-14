class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String[] str = myString.split("");
        for(int i = 0 ; i < str.length ; i++) {
            if(str[i].equals("A")) {
                str[i] = "B";
            } else {
                str[i] = "A";
            }
        }
        String joinStr = String.join("", str);
        
        if(joinStr.contains(pat)) {
            answer = 1;
        }
        
        return answer;
    }
}