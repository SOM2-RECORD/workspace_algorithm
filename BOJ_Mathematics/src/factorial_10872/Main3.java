package factorial_10872;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main3 {
	
	public static int factorial(int n) {
        int result = 1;
        while (n > 1) {
            result *= n;
            n--;
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
