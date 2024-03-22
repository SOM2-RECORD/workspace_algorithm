package cutline_25305;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		String[] caseArr = br.readLine().split(" ");
        int n = Integer.parseInt(caseArr[0]);
        int k = Integer.parseInt(caseArr[1]);
        
        String[] scoreStr = br.readLine().split(" ");;
        int[] score = new int[n];
        
        for(int i=0; i<n; i++) {
        	score[i] = Integer.parseInt(scoreStr[i]);
        }
        
        Arrays.sort(score);
        System.out.println(score[n-k]);
        
        br.close();
	}
}
