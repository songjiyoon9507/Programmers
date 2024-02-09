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
		
		int A = 1;
		int B = 1;
		int sum = 0;
		while(A != 0 && B != 0) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			
			A = Integer.parseInt(str.nextToken());
			B = Integer.parseInt(str.nextToken());
			sum = A+B;
			
			if (sum != 0) {
				bw.write(sum + "\n");
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}
}