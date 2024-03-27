package number_of_distinct_substrings_11478;

import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        HashSet<String> hash = new HashSet<>();

        int l = str.length();
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j <= l; j++) {
                hash.add(str.substring(i, j));
                System.out.println(str.substring(i, j));
            }
        }

        System.out.println(hash.size());
        br.close();
    }
}
