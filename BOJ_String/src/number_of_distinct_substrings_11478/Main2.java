package number_of_distinct_substrings_11478;

import java.io.*;
import java.util.HashSet;

public class Main2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		HashSet<String> hash = new HashSet<>();
		int l = str.length();
		for(int i=1; i<=l; i++) {
			for(int j=0; j+i<=l; j++) {
				hash.add(str.substring(j, j+i));
			}
		}
		
		System.out.println(hash.size());
		br.close();
	}
}
