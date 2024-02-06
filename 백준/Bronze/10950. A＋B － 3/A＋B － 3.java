import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 입력 받을 개수
		int T = sc.nextInt();

		// 입력 받은 A와 B T번 반복
		for (int i = 1 ; i <= T; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.println(A+B);
		}
	}
}