import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        List<String> list = new ArrayList<>();
        for(int i = 0 ; i < picture.length ; i++) {
            String[] temp = picture[i].split("");
            String str = "";
            for(int j = 0 ; j < temp.length; j++) {
                str += temp[j].repeat(k);
            }
            for(int l = 0 ; l < k ; l++) {
                list.add(str);
            }
        }
        return list.toArray(new String[list.size()]);
    }
}