class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        // 2진수로 바꿔서 문자열에 넣어줄 거
        for(int i = 0 ; i < n ;i++) {
            // 이진수로 변환
            String binary1 = String.format("%" + n + "s", Integer.toBinaryString(arr1[i])).replace(' ', '0');
            String binary2 = String.format("%" + n + "s", Integer.toBinaryString(arr2[i])).replace(' ', '0');
            
            StringBuilder sb = new StringBuilder();
            for(int j = 0 ; j < n ; j++) {
                
                if(binary1.charAt(j) == '1' || binary2.charAt(j) == '1') {
                    // 1이면 벽#
                    sb.append("#");
                } else {
                    // 0이면 빈칸
                    sb.append(" ");
                }
            }
            
            answer[i] = sb.toString();
        }
        return answer;
    }
}