import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// A 숫자로 받기
		int A = sc.nextInt();
		// 문자열로 받아서 하나씩 곱하기
		String B = sc.next();
		// charAt(indexNumber) 빼온 숫자가 아스키 코드로 변함
		// 숫자 1 아스키코드 49
		// 숫자 2 아스키코드 50
		// 숫자 3 아스키코드 51
		// ...
		// 숫자 0 아스키코드 48
		// charAt()으로 빼온 B 아스키 코드에서 아스키 코드 0 빼줘야
		// 원하는 숫자 나옴
		System.out.println(A * (B.charAt(2) - '0') );
		System.out.println(A * (B.charAt(1) - '0') );
		System.out.println(A * (B.charAt(0) - '0') );
		System.out.println(A * Integer.parseInt(B));
		
	}
}