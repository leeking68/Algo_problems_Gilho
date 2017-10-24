package Problems;

//1912 dijkstra

import java.util.PriorityQueue;
import java.util.Scanner;

public class boj1912 {

	static int n, m, INF = 9999999;
	static int arr[][];
	static int dist[];

	public static void dij(int start) {
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		q.offer(start);
		dist[start] = 0;
		arr[start][start] = 0;

		int before;

		while (!q.isEmpty()) {
			System.out.println("while");
			before = q.poll();
			for (int i = 0; i <=n; i++) {
				if (dist[i] > arr[before][i] + dist[before]) {
					dist[i] = arr[before][i] + dist[before];
					q.offer(i);
					System.out.println("i :" + i);
				}
			}
		}

	}

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		n = in.nextInt();
		m = in.nextInt();

		arr = new int[n+1][n+1];
		dist = new int[n+1];

		for (int i = 0; i <=n; i++) {
			dist[i] = INF;
			for (int j = 0; j <=n; j++) {
				arr[i][j] = INF;
			}
		}
		for (int i = 0; i < m; i++) {
			int from = in.nextInt();
			int to = in.nextInt();
			int w = in.nextInt();

			if (arr[from][to] > w) {
				arr[from][to] = w;
			}
		}

		int start = in.nextInt();
		int end = in.nextInt();

		dij(start);

		System.out.println(dist[end]);

	}
}
