class Solution {
    public String solution(String polynomial) {
        String[] arr = polynomial.split(" \\+ ");
        
        // x의 계수 합
        int xSum = 0;
        // 상수 합
        int nSum = 0;
        
        for(String a : arr) {
            if(a.contains("x")) {
                if(a.equals("x")) {
                    xSum += 1;
                } else {
                    xSum += Integer.parseInt(a.replace("x", ""));
                }
            } else {
                nSum += Integer.parseInt(a);
            }
        }
        
        // 결과를 문자열로 반환
        StringBuilder sb = new StringBuilder();
        
        if(xSum > 0) {
            if(xSum == 1) {
                sb.append("x");
            } else {
                sb.append(xSum).append("x");
            }
        }
        
        if(nSum > 0) {
            if(sb.length() > 0) {
                sb.append(" + ");
            }
            sb.append(nSum);
        }
        return sb.toString();
    }
}