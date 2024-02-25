import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		// 앞 뒤 공백을 split 은 개수로 셈
		StringTokenizer st = new StringTokenizer(str, " ");
		
		// .countTokens 토큰 개수
		System.out.println(st.countTokens());
	}
}