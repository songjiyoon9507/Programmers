import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		String str = sc.next();
		
		int answer = str.length();
		
		for(int i = 0 ; i < str.length() ; i++) {
			
			char ch = str.charAt(i);
			
			if(ch == 'c' && i < str.length()-1) {
				if (str.charAt(i+1) == '=' || str.charAt(i+1) == '-') {
					i++;
					answer -= 1;
				}
			}
			
			if(ch == 'd' && i < str.length()-1) {
				if (str.charAt(i+1) == '-') {
					i++;
					answer -= 1;
				} else if (str.charAt(i+1) == 'z' && i < str.length() - 2) {
					if(str.charAt(i+2) == '=') {
						i += 2;
						answer -= 2;
					}
				}
			}
			
			if(ch == 'l' && i < str.length()-1) {
				if (str.charAt(i+1) == 'j') {
					i++;
					answer -= 1;
				}
			}
			
			if(ch == 'n' && i < str.length()-1) {
				if (str.charAt(i+1) == 'j') {
					i++;
					answer -= 1;
				}
			}
			
			if(ch == 's' && i < str.length()-1) {
				if (str.charAt(i+1) == '=') {
					i++;
					answer -= 1;
				}
			}
			
			if(ch == 'z' && i < str.length()-1) {
				if (str.charAt(i+1) == '=') {
					i++;
					answer -= 1;
				}
			}

		}
		System.out.println(answer);
	}
}
