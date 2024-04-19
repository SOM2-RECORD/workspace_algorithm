package card_1835;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		Deque<Integer> deq = new LinkedList<>();
		for(int n=N; n>0; n--) {
			deq.addFirst(n);
			for(int i=0; i<n; i++) {
				deq.addFirst(deq.pollLast());
			}
		}
		
		while(!deq.isEmpty()) {
			sb.append(deq.pollFirst()).append(" ");
		}
		
		System.out.println(sb);
		br.close();
	}
}
