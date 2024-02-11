import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int X = sc.nextInt();
		
		int[] arr = new int[N];
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			boolean flag = false;
			
			if (arr[i] < X) {
				flag = true;
			}
			
			if(flag) {
				
				System.out.print(arr[i] +" ");
			}
		}	
	}
}