package stack_10828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main2 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			String[] ask = br.readLine().split(" ");
			switch(ask[0]) {
				case "push":
					stack.push(Integer.parseInt(ask[1]));
					break;
				case "pop":
					if(stack.empty()) {
						System.out.println(-1);
					}else {
						System.out.println(stack.pop());;
					}
					break;
				case "size":
					System.out.println(stack.size());
					break;
				case "empty":
					if(stack.empty()) {
						System.out.println(1);
					}else {
						System.out.println(0);;
					}
					break;
				case "top":
					if(stack.empty()) {
						System.out.println(-1);
					}else {
						System.out.println(stack.peek());;
					}
					break;
			}
		}
		br.close();
	}
}
