import java.util.Arrays;

class Solution {
    public int solution(String[] spell, String[] dic) {
        // spell 을 합쳐서 dic 배열 돌면서 한번씩 모두 사용한 거 같은 거 있으면 1 return
        Arrays.sort(spell);
        // ops
        // dxz
        String str = String.join("", spell);
        // 같은 문자열 확인하기 위해 다시 순서대로 정렬 후 join
        for(String d : dic) {
            // sod 를 배열로 만들어서 sort 한 다음 다시 join 해서 String으로 만들어서 값 비교해줄 거
            String[] arr = d.split("");
            Arrays.sort(arr);
            String compare = String.join("", arr);
        
            // 한개씩만 사용해서 같은 경우
            if(compare.equals(str)) return 1;
        }
        return 2;
    }
}