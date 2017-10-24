package Problems;

//boj 11562 백양로 브레이크 floyd warshall

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Boj11562floyd {

	static int n, map[][], INF = 999999;

	public static void main(String args[]) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		int u, v, b,k;
		String line[] = in.readLine().split(" ");
		n = Integer.parseInt(line[0]);
		int m = Integer.parseInt(line[1]);

		map = new int[n][n];

		init();

		for (int i = 0; i < m; i++) {
			line = in.readLine().split(" ");
			u = Integer.parseInt(line[0]) - 1;
			v = Integer.parseInt(line[1]) - 1;
			b = Integer.parseInt(line[2]) - 1;

			map[u][v] = 0;
			if (b == 1) {
				map[v][u] = 0;
			} else if (b == 0) {
				map[v][u] = 1;
			}
		}
		
		floyd();
		
		StringBuilder str = new StringBuilder();
		k = Integer.parseInt(in.readLine());
		while(k-->0){
			line = in.readLine().split(" ");
			u = Integer.parseInt(line[0])-1;
			v = Integer.parseInt(line[1])-1;
			str.append(map[u][v]+"\n");
		}
		
		out.write(str.toString());
		in.close();
		out.close();
		
	}
	
	public static void floyd() {
		for(int k = 0; k < n; k++) {
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					map[i][j] = Math.min(map[i][j], map[i][k]+map[k][j]);
				}
			}
		}
	}

	public static void init() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				map[i][j] = INF;

			}
		}
	}

}
