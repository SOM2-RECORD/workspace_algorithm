package sorting_card_1715;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		PriorityQueue<Long> pq = new PriorityQueue<>();
		for(int n=0; n<N; n++) {
			pq.add(Long.parseLong(br.readLine()));
		}
		
		long result = 0; // 비교 횟수
		while(pq.size()>1) {
			long a = pq.poll();
			long b = pq.poll();
			
			long newBundle = a+b;
			result += newBundle;
			
			pq.add(newBundle);
		}

		System.out.println(result);
		br.close();
	}
}
