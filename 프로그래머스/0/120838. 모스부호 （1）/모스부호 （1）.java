import java.util.*;

class Solution {
    public String solution(String letter) {
        StringBuilder sb = new StringBuilder();
        
        String[] morse = { 
                    ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", 
                    "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", 
                    "..-", "...-", ".--", "-..-", "-.--", "--.."};
        
        Map<String, Character> map = new HashMap<>();
        for(int i = 0 ; i < morse.length ; i++) {
            map.put(morse[i], (char)('a' + i));
        }
        
        String[] splitLetter = letter.split(" ");
        
        for(String s : splitLetter) {
            sb.append(map.get(s));
        }
        
        return sb.toString();
    }
}