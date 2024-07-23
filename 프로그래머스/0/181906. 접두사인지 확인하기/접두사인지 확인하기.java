class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        String[] temp = new String[my_string.length()];
        
        for (int i = 0 ; i < my_string.length() ; i++) {
      temp[i] = my_string.substring(0,i);  
        }
        
        for (int j = 0 ; j < temp.length ; j++) {
            if(temp[j].equals(is_prefix)) {
                answer = 1;
            }
        }
        
        return answer;
    }
}