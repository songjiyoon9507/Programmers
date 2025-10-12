class Solution {
    public int[] solution(long n) {
        
        String str = n + "";
        int[] answer = new int[str.length()];
        String[] arr = str.split("");

        int j = 0;
        
        for(int i = arr.length - 1 ; i >= 0 ; i--) {
            answer[i] = Integer.parseInt(arr[j]);
            j++;
        }
        return answer;
    }
}