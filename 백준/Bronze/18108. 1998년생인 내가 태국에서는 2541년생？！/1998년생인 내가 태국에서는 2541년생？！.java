import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 불기 연도(y) - 543 = 서기 연도(x)
		int y = sc.nextInt();
		
		System.out.println(y-543);
	}
	
}