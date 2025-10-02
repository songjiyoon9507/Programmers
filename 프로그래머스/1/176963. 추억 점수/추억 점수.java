class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        // photo 사진이 여러장임 일단 이중 for문으로 photo 안에 사람들 이름을 돌아야함
        for(int i = 0 ; i < photo.length ; i++) {
            // 첫번째 줄 돌기
            int totalPoint = 0;
            // 첫번째 줄 전체 돌기
            for(int j = 0 ; j < photo[i].length ; j++) {
                // 첫번째 줄 전체를 돌면서 점수 더해주기
                for(int k = 0 ; k < name.length ; k++) {
                    if(photo[i][j].equals(name[k])) {
                        totalPoint += yearning[k];
                    }
                }
            }
            // 첫번째줄 전체 다 돌고 더해진 totalPoint 를 answer에 넣어주기
            answer[i] = totalPoint;
        }
        
        return answer;
    }
}