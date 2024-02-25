import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 0 ; i < T ; i++) {
			
			int R = sc.nextInt();
			
			String S = sc.next();
			
			for(int j = 0 ; j < S.length() ; j++) {
				//문자열만큼 반복
				for(int k = 0 ; k < R ; k++) {
					// 입력한 R번 문자 반복
					System.out.print(S.charAt(j));
					// k 아니고 j 써야 같은 걸 R만큼 반복
				}
			}
			System.out.println();
		}
	}
}