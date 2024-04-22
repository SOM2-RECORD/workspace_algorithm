package tomato_7569;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[][][] tomato;
	static boolean[][][] visited;
	static int date = 0;
	
	static void BFS(int m, int n, int h) {
		
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int M = Integer.parseInt(st.nextToken()); //상자 가로 길이
		int N = Integer.parseInt(st.nextToken()); //상자 세로 길이
		int H = Integer.parseInt(st.nextToken()); //상자 높이
		
		tomato = new int[M][N][H];
		visited = new boolean[M][N][H];
		
		for(int h=0; h<H; h++) {
			for(int m=0; m<M; m++) {
				st = new StringTokenizer(br.readLine(), " ");
				for(int n=0; n<N; n++) {
					tomato[m][n][h] = Integer.parseInt(st.nextToken());
				}
			}
		}
		
		
		
		
		
		br.close();
	}
}
