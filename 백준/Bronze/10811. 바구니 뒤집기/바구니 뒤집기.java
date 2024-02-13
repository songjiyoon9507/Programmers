import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] arr = new int[N];
		
		for(int x = 0 ; x < arr.length ; x++) {
			arr[x] = x+1;
		}
		
		for(int x = 0 ; x < M ; x++) {
			int i = sc.nextInt() - 1;
			int j = sc.nextInt() - 1;
			
			int temp = 0;
			
			for ( ; i < j ; i++) {				
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j--;
			}
			
		}
		
		for(int x = 0 ; x < arr.length ; x++) {
			System.out.print(arr[x] + " ");
		}
		
	}
}