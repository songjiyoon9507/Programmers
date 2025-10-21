class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int max = 0;
        int min = 0;
        
        if(n >= m) {
            max = n;
            min = m;
        } else {
            max = m;
            min = n;
        }
        // 최대공약수
        answer[0] = gcd(min, max);
        // 최소공배수
        answer[1] = lcm(min, max);

        return answer;
    }
    
    // 유클리드 호제법(최대공약수)
    public int gcd(int a, int b) {
        
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    // 최소공배수
    public int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}