class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        int size = my_string.length() - 1;
        String[] arr = my_string.split("");
        
        for(int i = size ; i >= 0 ; i--) {
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}