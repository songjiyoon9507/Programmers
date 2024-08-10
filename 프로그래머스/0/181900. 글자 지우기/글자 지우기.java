class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        
        String[] temp = my_string.split("");
        
        for(int i = 0 ; i < indices.length ; i++) {
            temp[indices[i]] = "";
        }
        
        for(int j = 0 ; j < temp.length ; j++) {
            answer += temp[j];
        }
        
        return answer;
    }
}