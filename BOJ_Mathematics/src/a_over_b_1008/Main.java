package a_over_b_1008;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		
		Double a = Double.parseDouble(input[0]);
		Double b = Double.parseDouble(input[1]);
		
		System.out.println(a/b);
		
		br.close();
	}

}
