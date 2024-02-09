import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		int sum = 0;
		
		for(int i = 0 ; i < T ; i++) {
			
			// 기본 공백 분리 " " 안 써도 됨
			StringTokenizer str = new StringTokenizer(br.readLine());
			
			int A = Integer.parseInt(str.nextToken());
			int B = Integer.parseInt(str.nextToken());
			sum = A+B;
			bw.write(sum + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}