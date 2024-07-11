class Solution {
    public String solution(String my_string, int[] index_list) {
        // String 을 split 한 후 map 에 담은 다음에 key 값으로 꺼내서 배열을 만들어서 다시 이어붙임
        // 더 간단한 방법 charAt 사용
        String answer = "";
        for(int i = 0 ; i < index_list.length ; i++) {
            answer += my_string.charAt(index_list[i]);
        }
        return answer;
    }
}