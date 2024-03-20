package factorial_10872;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	// 팩토리얼 n! = n(n-1)! = n(n-1)(n-2)! = ··· = n(n-1)···3·2·1·0!
	static public int factorial(int k) {
		if(k == 0) {
			return 1;
		}else {
			return k*factorial(k-1);
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// n : 12이하 정수
		int n = Integer.parseInt(br.readLine());
		System.out.println(factorial(n));
		br.close();
	}
}
