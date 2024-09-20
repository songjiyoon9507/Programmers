import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());

		int count = num;
		
		for(int i = 0 ; i < num ; i++) {

			String str = br.readLine();
			
			boolean check[] = new boolean[26];

			for(int j = 0 ; j < str.length() - 1 ; j++) {

				check[str.charAt(j)-97] = true;

				if( (str.charAt(j) != str.charAt(j+1)) && (check[str.charAt(j+1)-97] == true) ) {
					count--;
					break;
				}
				
			}
		}
		System.out.println(count);
        br.close();
	}
}