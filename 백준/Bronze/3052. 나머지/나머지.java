import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		int count = 0;
				
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = sc.nextInt() % 42;
		}
		
		for(int i = 0 ; i < arr.length ; i++) {
			int flag = 0;
			
			// 같은 인덱스번호는 비교하면 안됨 i 늘어날 때 j도 늘어나야함
			for(int j = i+1 ; j < arr.length ; j++) {
				if(arr[i] == arr[j]) { // 같을 때
					flag++;
				}
			}
			if(flag == 0) { // 같은 숫자가 없을 때
				count++;
			}
		}
		
		System.out.println(count);
		
	}
}