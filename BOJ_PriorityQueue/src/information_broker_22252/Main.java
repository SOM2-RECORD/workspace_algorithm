package information_broker_22252;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long result = 0;

		HashMap<String, PriorityQueue<Integer>> info = new HashMap<>();
		for(int i=0; i<n; i++) {
			String[] input = br.readLine().split(" ");
			String type = input[0];
			String keyword = input[1];
			if(type.equals("1")) {
				PriorityQueue<Integer> pq = info.getOrDefault(keyword, new PriorityQueue<>((a, b) -> Integer.compare(b, a)));
                for (int j = 3; j < input.length; j++) {
                    pq.add(Integer.parseInt(input[j]));
                }
                info.put(keyword, pq);
			}else if(type.equals("2")) {
				PriorityQueue<Integer> pq = info.get(keyword);
				if(pq == null) continue;
				int k = Integer.parseInt(input[2]);
				for (int j = 0; j < k && !pq.isEmpty(); j++) {
                    result += pq.poll();
                }
			}
		}
		
		System.out.println(result);
		br.close();
	}
}
