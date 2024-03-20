package factorial_10872;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
	
	public static int factorial(int n) {
        int result = 1;
        for(int i=n; i>0; i--) {
        	result *= i;
        }
        return result;
    }
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// n : 12이하 정수
		int n = Integer.parseInt(br.readLine());
		System.out.println(factorial(n));
		br.close();
	}
}
