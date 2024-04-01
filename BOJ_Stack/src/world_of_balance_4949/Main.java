package world_of_balance_4949;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true) {
        	String str = br.readLine();
	        if(str.equals(".")) {
	        	break;
	        }
	        
	        String[] strArr = str.split("");
	        Stack<String> stack = new Stack<>();
	        
	        outerLoop:
	        for(int i=0; i<strArr.length; i++) {
	        	String s = strArr[i];
	        	switch(s){
	        		case "(":
	        		case "[":
	        			stack.push(s);
	        			break;
	        		case ")":
	        			if(stack.empty() || !stack.peek().equals("(")) {
	        				stack.push("fail");
	        				break outerLoop;
	        			}else {
	        				stack.pop();
	        			}
	        			break;
	        		case "]":
	        			if(stack.empty() || !stack.peek().equals("[")) {
	        				stack.push("fail");
	        				break outerLoop;
	        			}else {
	        				stack.pop();
	        			}
	        			break;
	        	}
	        }
	        if(!stack.empty()) {
	        	sb.append("no\n");
	        }else {
	        	sb.append("yes\n");
	        }
        }
        
        System.out.println(sb);
        br.close();
    }
}
