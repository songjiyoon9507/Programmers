class Solution {
    public int[] solution(String[] wallpaper) {
        // 한 행씩 돌면서 # 이 포함 된 가장 첫번째 행이 S 첫번째를 결정 lux
        // 행의 # 중 가장 앞쪽 # 이 S 의 2번째 값 결정 luy
        int lux = 0;
        int luy = wallpaper[0].length();
        for(int i = 0 ; i < wallpaper.length ; i++) {
            if(wallpaper[i].contains("#")) {
                lux = i;
                break;
            }
        }
        
        for(int i = 0 ; i < wallpaper.length ; i++) {
            if(wallpaper[i].indexOf("#") != -1) {
                int temp = wallpaper[i].indexOf("#");
                if(luy >= temp) {
                    luy = temp;
                }
            }
        }
        
        // 끝 점 E(rdx, rdy)는 어떻게 구할 것인가?
        // 뒤에서부터 세면 됨
        int rdx = 0;
        int rdy = 0;
        for(int i = wallpaper.length - 1 ; i >= 0 ; i--) {
            if(wallpaper[i].contains("#")) {
                rdx = i + 1; // index 가 2이면 3까지 드래그해야함
                break;
            }
        }
        
        for(int i = wallpaper.length - 1 ; i >= 0 ; i--) {
            if(wallpaper[i].indexOf("#") != -1) {
                int temp = wallpaper[i].lastIndexOf("#") + 1; // 마지막 #
                if(rdy < temp) { // 최대값 비교
                    rdy = temp;
                }
            }
        }
        
        int[] answer = {lux, luy, rdx, rdy};
        return answer;
    }
}