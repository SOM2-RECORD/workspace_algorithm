package sorting_words_1181;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.TreeSet;

public class Main3 {

	static class StringComparator implements Comparator<String> {
		@Override
		public int compare(String a, String b) {
			if(a.length() != b.length()) {
				return Integer.compare(a.length(), b.length());
			}else {
				return a.compareTo(b);
			}
		}
	}
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        TreeSet<String> tree = new TreeSet<>(new StringComparator());
        for(int i=0; i<n; i++) {
    		tree.add(br.readLine());
        }
        
        StringBuilder sb = new StringBuilder();
        for(String str : tree) {
        	sb.append(str).append("\n");
        }
        
        System.out.println(sb);
        br.close();
    }
}
