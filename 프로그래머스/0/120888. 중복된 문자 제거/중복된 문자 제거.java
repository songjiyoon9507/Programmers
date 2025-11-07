class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder(my_string);
        for(int i = 0 ; i < sb.length() ; i++) {
            for(int j = i+1 ; j < sb.length() ; j++) {
                if(sb.charAt(i) == sb.charAt(j)) {
                    sb.setCharAt(j, '^');
                }
            }
        }
        return sb.toString().replace("^", "");
    }
}