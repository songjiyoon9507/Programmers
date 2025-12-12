import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int idx = 0;
        String str = "";
        for(int i = 0 ; i < n ; i++) {
            if(i <= idx) {
                str += "*";
            } else {
                str += "";
            }
            idx++;
            System.out.println(str);
        }
        
    }
}