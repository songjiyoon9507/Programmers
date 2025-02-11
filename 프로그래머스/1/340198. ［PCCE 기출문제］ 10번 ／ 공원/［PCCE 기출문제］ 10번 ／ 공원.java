import java.util.Arrays;

class Solution {
    public int solution(int[] mats, String[][] park) {
        int row = park.length;
        int col = park[0].length;
        int max = -1;
        
        Arrays.sort(mats);
        
        for(int i = mats.length - 1; i >= 0; i--) {
            boolean canPlace = false;
            
            for(int j = 0; j <= row - mats[i]; j++) {
                for(int k = 0; k <= col - mats[i]; k++) {
                    boolean minusOne = true;
                    
                    for(int x = j; x < j + mats[i]; x++) {
                        for(int y = k; y < k + mats[i]; y++) {
                            if(!park[x][y].equals("-1")) {
                                minusOne = false;
                                break;
                            }
                        }
                        if(!minusOne) break;
                    }
                    if(minusOne) {
                        canPlace = true;
                        break;
                    }
                }
                if(canPlace) break;
            }
            if(canPlace) {
                max = mats[i];
                break;
            }
        }
        return max;
    }
}