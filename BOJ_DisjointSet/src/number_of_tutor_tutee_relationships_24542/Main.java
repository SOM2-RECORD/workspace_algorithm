package number_of_tutor_tutee_relationships_24542;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	static int[] parent;
	
	static void union(int x, int y) {
		x = find(x);
		y = find(y);

		if(x < y) parent[y] = x;
		else if(x > y) parent[x] = y;
	}
	
	static int find(int x) {
		if(x == parent[x]) return x;
		return parent[x] = find(parent[x]);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		long result = 1;
		
		parent = new int[n+1];
		for(int i=1; i<=n; i++) {
			parent[i] = i;
		}
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			union(x, y);
		}
		
		HashMap<Integer, Integer> hash = new HashMap<>();
		for(int i=1; i<=n; i++) {
			hash.put(parent[i], hash.getOrDefault(parent[i], 0) +1);
		}
		for(int root : hash.keySet()) {
			result *= hash.get(root);
			result %= 1000000007;
		}
		
		System.out.println(result);
		br.close();
	}
}
