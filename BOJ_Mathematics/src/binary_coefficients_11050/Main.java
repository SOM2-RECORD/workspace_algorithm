package binary_coefficients_11050;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int factorial(int k) {
		if(k == 0) {
			return 1;
		}else {
			return k*factorial(k-1);
		}
	}
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        int result = factorial(n) / (factorial(k)*factorial(n-k));
        System.out.println(result);
        br.close();
    }
}
