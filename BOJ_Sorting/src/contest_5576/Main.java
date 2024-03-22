package contest_5576;

import java.io.*;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] wScore = new int[10];
		int[] kScore = new int[10];
		for(int i=0; i<10; i++) {
			wScore[i] = Integer.parseInt(br.readLine());
		}
		for(int i=0; i<10; i++) {
			kScore[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(wScore);
		Arrays.sort(kScore);
		System.out.println((wScore[9]+wScore[8]+wScore[7]) + " " + (kScore[9]+kScore[8]+kScore[7]));
		br.close();
	}
}
