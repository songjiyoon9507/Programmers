import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        // 들어온 ext 가 있는 index 번호를 뽑아서
        // val_ext 보다 작은 것만 기억
        // 그 행의 sort_by 로 들어온 값 index 기준으로 정렬
        String[] c = {"code", "date", "maximum", "remain"};
        int cInt = 0;
        for(int i = 0 ; i < c.length ; i++) {
            if(ext.equals(c[i])) {
                cInt = i;
                break;
            }
        }
        
        // data 의 cInt 행을 돌면서 cInt 열을 확인해서 val_ext 보다 작은지 판단 후 list 의 그 행을 넣어둠
        // list 를 돌면서 list 안의 행 값으로 sort?
        List<int[]> list = new ArrayList<>();
        for(int i = 0 ; i < data.length ; i++) {
            // 해당 행의 cInt 열의 값 확인
            if(data[i][cInt] < val_ext) {
                list.add(data[i]);
            }
        }
        
        // sort_by 할 index
        int sInt = 0;
        for(int i = 0 ; i < c.length ; i++) {
            if(sort_by.equals(c[i])) {
                sInt = i;
                break;
            }
        }
        
        // 람다식 사용 시
        final int sortIndex = sInt;
        
        // list 의 행을 sort 하면 됨
        list.sort((a,b) -> Integer.compare(a[sortIndex], b[sortIndex]));
        
        return list.toArray(new int[list.size()][]);
    }
}