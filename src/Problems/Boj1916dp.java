package Problems;

// 1916 백준 최소 비용 구하기 : 다익스트라 

import java.util.Scanner;
import java.util.PriorityQueue;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Boj1916dp {

	public static int n, m, dist[], map[][];
	public static final int INF = 1000000001;

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		n = Integer.parseInt(in.readLine());
		m = Integer.parseInt(in.readLine());
		dist = new int[n];
		map = new int[n][n];

		init();

		int from, to, w;
		for (int i = 0; i < m; i++) {
			String[] line = in.readLine().split(" ");
			from = Integer.parseInt(line[0]) - 1;
			to = Integer.parseInt(line[1]) - 1;
			w = Integer.parseInt(line[2]) - 1;
			if (map[from][to] > w) {
				map[from][to] = w;
			}

		}
		String[] line = in.readLine().split(" ");
		int start = Integer.parseInt(line[0]) - 1;
		int end = Integer.parseInt(line[1]) - 1;
		dij(start);
		out.write(String.valueOf(dist[end]));
		out.close();
		in.close();
	}

	public static void dij(int start) {

		PriorityQueue<Integer> pq = new PriorityQueue<>();

		pq.offer(start);
		map[start][start] = 0;
		dist[start] = 0;
		while (!pq.isEmpty()) {
			int k = pq.poll();

			for (int i = 0; i < n; i++) {
				if (dist[i] > map[k][i] + dist[k]) {
					dist[i] = map[k][i] + dist[k];
					pq.offer(i);
				}
			}

		}

	}

	public static void init() {
		for (int i = 0; i < n; i++) {
			dist[i] = INF;
			for (int j = 0; j < n; j++) {
				map[i][j] = INF;
			}
		}
	}

}
