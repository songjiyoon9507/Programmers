import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		br.close();
		
		int spaceCount = N-1;
		int starCount = 1;
		
		for(int i = 0 ; i < N ; i++) {
			for(int j = 0 ; j < spaceCount ; j++ ) {
				bw.write(" ");
			}
			for(int j = 0 ; j < starCount ; j++) {
				bw.write("*");
			}		
			bw.write("\n");
			spaceCount--;
			starCount++;
		}
		bw.flush();
		bw.close();
		
	}
}