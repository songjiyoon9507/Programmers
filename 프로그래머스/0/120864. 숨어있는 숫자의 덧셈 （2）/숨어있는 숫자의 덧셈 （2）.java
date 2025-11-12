class Solution {
    public int solution(String my_string) {
        int answer = 0;
        // 소문자, 대문자를 모두 빈값으로 채움
        // replaceAll 정규표현식 빈칸으로 나눠서 배열에 담음
        String[] arr = my_string.replaceAll("[^0-9]", " ").split(" ");
        
        // 배열 돌면서 더해주면 됨
        for(String a : arr) {
            if(!a.isEmpty()) {
                answer += Integer.parseInt(a);
            }
        }
        return answer;
    }
}