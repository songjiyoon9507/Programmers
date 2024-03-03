import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[26];
		
		String str = sc.next().toUpperCase();
		
		for (int i = 0 ; i < str.length() ; i++) {
			int temp = str.charAt(i) - 65;

			arr[temp]++;

		}
		
		int max = -1;
		char ch = '?';
		
		for (int i = 0 ; i < arr.length ; i ++) {
			if(arr[i] > max) {
				max = arr[i];
				ch = (char)(i + 65);
			} else if (arr[i] == max) {
				ch = '?';
			}
		}
		System.out.println(ch);
	}
}
