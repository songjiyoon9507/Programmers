class Solution {
    public int solution(String s) {
        // 배열에 영단어를 담아줌
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        // 영단어가 포함돼있을 때 그 단어를 index 넘버로 바꿔줌(문자열이라 문자열로 바꿔서 담아줌)
        for(int i = 0 ; i < arr.length ; i++) {
            s = s.replaceAll(arr[i], String.valueOf(i));
        }
        // 반환형 int 다시 int 형으로 바꿔서 돌려줌
        return Integer.parseInt(s);
    }
}