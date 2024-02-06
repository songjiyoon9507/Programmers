import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int[] numbers = {A, B, C};
		int max = numbers[0];
		
		if (A == B && B == C) { // 같은 눈 세개
			int price = 0;
			price = 10000+A*1000;
			System.out.println(price);
		} else if (A==B) { // 같은 눈 두개
			int price = 0;
			price = 1000+A*100;
			System.out.println(price);
		}  else if (C==B) { // 같은 눈 두개
			int price = 0;
			price = 1000+B*100;
			System.out.println(price);
		}  else if (A==C) { // 같은 눈 두개
			int price = 0;
			price = 1000+A*100;
			System.out.println(price);
		} else {
			// 최대값 찾는 식
			for (int i = 1 ; i < numbers.length ; i++) {
				if (numbers[i] > max) {
					max = numbers[i];
				}
			}
			int price = 0;
			price = max*100;
			System.out.println(price);
		}
		
	}
}