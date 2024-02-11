import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 배열 길이
		
		int M = sc.nextInt(); // 반복 횟수
		
		int[] arr = new int[N];
		
		for(int x = 0 ; x < M ; x++) { // 
			int i = sc.nextInt();
			int j = sc.nextInt();
			int k = sc.nextInt();
			
			for(int y = i-1 ; y < j ; y++) { // 입력 받은 줄에서의 반복
				arr[y] = k;
			}
			
		}
		
		for(int x = 0 ; x < N ; x++) {
			System.out.print(arr[x] + " ");
		}
		
	}
}