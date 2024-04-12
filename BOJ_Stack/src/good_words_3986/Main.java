package good_words_3986;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Stack<String> stack;
		String[] word;
		int k = 0;
		for(int i=0; i<N; i++) {
			stack = new Stack<>();
			word = br.readLine().split("");
			for(int j=0; j<word.length; j++) {
				if(stack.empty() || !stack.peek().equals(word[j])) stack.push(word[j]);
				else stack.pop();
			}
			if(stack.empty()) k++;
		}
		
		System.out.println(k);
		br.close();
	}
}
