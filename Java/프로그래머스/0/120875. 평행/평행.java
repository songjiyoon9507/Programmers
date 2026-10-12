class Solution {
    public int solution(int[][] dots) {
        // y2 - y1 / x2 - x1 기울기
        // 기울기가 같으면 평행
        // 점 두개씩 짝짓기
        // 1,2 일 때 3,4
        // 1,3 일 때 2,4
        // 1,4 일 때 2,3
        // index 로 따지면 -1씩 평행 함수 호출 true 이면 return 1
        if(parallel(dots[0], dots[1], dots[2], dots[3])) {
            return 1;
        }
        if(parallel(dots[0], dots[2], dots[1], dots[3])) {
            return 1;
        }
        if(parallel(dots[0], dots[3], dots[1], dots[2])) {
            return 1;
        }
        return 0;
    }
    
    // 평행
    public boolean parallel(int[] a, int[] b, int[] c, int[] d) {
        // y2 - y1 / x2 - x1 = y4 - y3 / x4 - x3
        // (y2 - y1)*(x4 - x3) = (y4 - y3)*(x2 - x1)
        long dy1 = b[1] - a[1];
        long dx1 = d[0] - c[0];
        
        long dy2 = d[1] - c[1];
        long dx2 = b[0] - a[0];
        
        return dy1 * dx1 == dy2 * dx2;
    }
    
}