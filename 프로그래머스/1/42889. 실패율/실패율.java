import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        // 멈춰 있는 배열 stages
        // N+1 마지막까지 깬 사람
        // stages에 담긴 배열 수 (도전자 수)
        // 도전자 수 중 멈춰있는 배열 돌면서 찾기

        // index 0 실패율 1스테이지 실패율
        // 1 3 2 1 0
        // 반 이상 떨어진 3번 실패율이 제일 높음
        // 1번 스테이지부터 N+1번 스테이지까지
        // 0 1 2 ~ N+1까지니까 N+2 배열 크기
        int[] numberOfPeople = new int[N+2];
        for(int s : stages) {
            // s가 멈춤 스테이지니까 numberOfPeople 배열에 몇 명인지를 담아줌
            numberOfPeople[s]++;
            // index 1에 1번 멈춘 사람 한명 담고 2 2명
        }
        
        // 전체 도전자 수는 스테이지 지날수록 점점 줄어듦
        int challenger = stages.length; // 전체 도전자 수는 배열 길이임
        // map에 실패율 담아줌 여기에 스테이지랑 실패율 같이 담아줘야함
        Map<Integer, Double> map = new HashMap<>();
        // 스테이지 배열을 돌면서
        for(int i = 1 ; i <= N ; i++) {
            if(challenger == 0) {
                map.put(i, 0.0);
            } else {
                // 실패율 = 스테이지 머무른 사람 / 도전자수
                double rate = (double) numberOfPeople[i] / challenger;
                map.put(i, rate);
                // 도전자 수는 그 스테이지에 머문 사람 수 빼줘야함
                
                // 1 단계에 1명 머무르면 다음 도전자 수 7 명 2단계 3명 머물러서 다음 도전자 수 4명
                challenger -= numberOfPeople[i];
            }
        }
        
        // 실패율 내림차순 정렬, 같으면 번호 오름차순
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((a, b) -> {
            if (Double.compare(map.get(b), map.get(a)) == 0) {
                return a - b;
            } else {
                return Double.compare(map.get(b), map.get(a));
            }
        });
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}