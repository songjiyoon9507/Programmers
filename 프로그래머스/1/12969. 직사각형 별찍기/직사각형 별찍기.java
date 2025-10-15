import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = 0 ; i < b ; i++) {
            for(int j = 0 ; j < a ; j++) {
                // 연속 별 5개 찍기 
                System.out.print("*");
            }
            // 줄바꿈
            System.out.println("");
        }
    }
}