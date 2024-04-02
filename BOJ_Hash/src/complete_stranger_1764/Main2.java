package complete_stranger_1764;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] caseArr = br.readLine().split(" ");
		int n = Integer.parseInt(caseArr[0]);
		int m = Integer.parseInt(caseArr[1]);
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<n; i++) {
			list1.add(br.readLine());
		}
		
		for(int i=0; i<m; i++) {
			list2.add(br.readLine());
		}
		
		list1.retainAll(list2);
		Collections.sort(list1);
		int size = list1.size();
		sb.append(size).append("\n");
		for(int i=0; i<size; i++) {
			sb.append(list1.get(i)).append("\n");
		}
		
		System.out.println(sb);
		br.close();
	}
}
