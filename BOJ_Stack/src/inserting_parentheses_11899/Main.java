package inserting_parentheses_11899;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split("");
		Stack<String> stack= new Stack<>();
		for(int i=0; i<input.length; i++) {
			if(input[i].equals("(")) {
				stack.push("(");
			}else if(!stack.empty() && stack.peek().equals("(")){
				stack.pop();
			}else {
				stack.push(")");
			}
		}
		
		System.out.println(stack.size());
		br.close();
	}
}
