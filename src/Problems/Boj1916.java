package Problems;

// boj 1916 최소비용구하기 다익스트라 

import java.util.Scanner;
import java.util.PriorityQueue;

public class Boj1916 {

	static int n, m, INF = 999999999;
	static int map[][];
	static int dist[];

	public static void dij(int start) {

		

		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.offer(start);
		map[start][start] = 0;
		dist[start] = 0;
		int before;
		while (!pq.isEmpty()) {
			before = pq.poll();
			for (int i = 0; i < n; i++) {
				if (dist[i] > dist[before] + map[before][i]) {
					dist[i] = dist[before] + map[before][i];
					pq.offer(i);
					System.out.println(i);
				}
			}

		}

	}

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int m = in.nextInt();

		map = new int[n+1][n+1];
		dist = new int[n+1];

		for (int i = 0; i <=n; i++) {
			dist[i] = INF;
			for (int j = 0; j <=n; j++) {
				map[i][j] = INF;
			}
		}

		for (int i = 0; i < m; i++) {
			int from = in.nextInt();
			int to = in.nextInt();
			int w = in.nextInt();
			if(map[from][to]>w)
				map[from][to] = w;
		}
		
		int start = in.nextInt();
		int end = in.nextInt();

		dij(start);
		System.out.println(dist[end]);
	}

}
