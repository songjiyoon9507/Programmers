class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;
  
        // n = 22, w = 6, num = 8
        int[] col = new int[w];
        
        for(int i = 0 ; i < w ; i++) {
            col[i] = n / w;
        }

        if(n / w % 2 != 0) {
            // 홀수일 경우 오른쪽에서 시작
            for(int i = w - 1 ; i > w - 1 - n % w ; i--) {
                col[i] += 1;
            }
        } else if( n / w % 2 == 0)  {
            // 짝수일 경우 왼쪽에서 시작
            for(int i = 0 ; i < n % w ; i++) {
                col[i] += 1;
            }
        }

        if(num % w == 0 && num / w % 2 == 0) {
            answer = col[0] - num / w + 1;
        } else if(num % w == 0 && num / w % 2 != 0) { 
            answer = col[w - 1] - num / w + 1;
        }

        if(num / w % 2 == 0 && num % w != 0) {
            answer = col[num % w - 1] - num / w;
        } else if(num / w % 2 != 0 && num % w != 0) {
            answer = col[w - num % w] - num / w;
        }
        return answer;
    }
}