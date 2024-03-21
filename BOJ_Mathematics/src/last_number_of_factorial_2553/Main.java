package last_number_of_factorial_2553;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static long findRightMostNonZeroDigit(int k) {
		long result = 1;
        for(int i=2; i<=k; i++) {
        	result *= i;
        	result %= 10000000;
        	while(result % 10 == 0) {
        		result /= 10;
        	}
        }
        return result % 10;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(findRightMostNonZeroDigit(n));
		br.close();
	}
}
