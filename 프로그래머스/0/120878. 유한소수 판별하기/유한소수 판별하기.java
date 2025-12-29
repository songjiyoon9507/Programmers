class Solution {
    public int solution(int a, int b) {
        // 최대공약수
        int gcdNum = gcd(a, b);
        // 약분
        b /= gcdNum;
        
        // 분모에서 2 제거
        while(b % 2 == 0) {
            b /= 2;
        }
        
        // 분모에서 5 제거
        while(b % 5 == 0) {
            b /= 5;
        }
        
        // 판별
        return b == 1 ? 1 : 2;
    }
    
    // 유클리드 호제법 최대공약수 구하기
    private int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}