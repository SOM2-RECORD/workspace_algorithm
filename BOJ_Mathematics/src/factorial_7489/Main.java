package factorial_7489;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static int findRightMostNonZeroDigit(int k) {
		int result = 1;
        for(int i=2; i<=k; i++) {
        	result *= i;
        	result %= 100000;
        	while(result % 10 == 0) {
        		result /= 10;
        	}
        }
        return result % 10;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
			int n = Integer.parseInt(br.readLine());
			System.out.println(findRightMostNonZeroDigit(n));
		}
		
		br.close();
	}
}
