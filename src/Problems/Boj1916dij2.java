package Problems;

import java.util.Arrays;

import java.util.Scanner;
import java.util.PriorityQueue;

public class Boj1916dij2 {

	public static int n, m, map[][], dist[], INF = 100001;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();

		map = new int[n + 1][n + 1];
		dist = new int[n + 1];

		
		for(int i = 0; i < n+1; i++) {
			dist[i] = INF;
			for(int j = 0; j < n+1; j++) {
				map[i][j] = INF;
			}
		}
		
		for (int i = 0; i < m; i++) {
			int from = in.nextInt();
			int to = in.nextInt();
			int w = in.nextInt();
			map[from][to] = w;
			
			if(map[from][to] > w) {
				map[from][to] = w;
			}
			
			
		}

		int start = in.nextInt();
		int end = in.nextInt();

		dij(start);
		System.out.println(dist[end]);

	}

	public static void dij(int start) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		map[start][start] = 0;
		dist[start] = 0;
		pq.offer(start);

		int before = 0;
		while (!pq.isEmpty()) {

			before = pq.poll();

			for (int i = 1; i < n + 1; i++) {
				if (dist[i] > map[before][i] + dist[before]) {
					dist[i] = map[before][i] + dist[before];
					pq.offer(i);
				}

			}

		}

	}

}
