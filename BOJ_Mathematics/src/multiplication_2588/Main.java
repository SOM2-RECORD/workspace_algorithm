package multiplication_2588;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		int three = a*(b%10);
		int four = a*((b/10)%10);
		int five = a*((b/100)%10);
		
		System.out.println(three);
		System.out.println(four);
		System.out.println(five);
		System.out.println(five*100 + four*10 + three);
		
		br.close();
	}
}
