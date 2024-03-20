package factorial_10872;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main4 {
	
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
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// n : 12이하 정수
			int n = Integer.parseInt(br.readLine());
        bw.write(factorial(n) + "\n");
		br.close();
        bw.close();
	}
}
