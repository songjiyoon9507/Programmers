class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        // 양꼬치 n인분 10인분에 음료수 1개
        int drink = n / 10;
        // 서비스 음료 개수를 총 마신 음료 개수에서 빼줌
        answer = n * 12000 + (k - drink) * 2000;
        return answer;
    }
}