class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        
        for(int i = myString.length() - 1 ; i >=0 ; i--) {
            String temp = myString.substring(0, i + 1);
            if(temp.endsWith(pat)) {
                answer = temp;
                break;
            }
            
        }
        
        return answer;
    }
}