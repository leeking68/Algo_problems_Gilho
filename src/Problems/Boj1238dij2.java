package Problems;

import java.util.PriorityQueue;

/**
 *
 *
 * 백준 1231 파티 
 * 
 * 풀이법 : 플로이드 
 *
 */

import java.util.Scanner;

public class Boj1238dij2 {

	public static int N, M, K, remap[][], map[][], INF = 1000 * 100 + 1;
	public static int dist[], redist[];

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		M = in.nextInt();
		K = in.nextInt();
		map = new int[N + 1][N + 1];
		remap = new int[N + 1][N + 1];
		dist = new int[N + 1];
		redist = new int[N + 1];
		int maxDistance = -1;

		for (int i = 0; i < N + 1; i++) {
			dist[i] = redist[i] = INF;
			for (int j = 0; j < N + 1; j++) {
				map[i][j] = remap[i][j] = INF;
			}
		}

		for (int i = 0; i < M; i++) {
			int from = in.nextInt();
			int to = in.nextInt();
			int w = in.nextInt();
			map[from][to] = remap[to][from] = w;
		}

		dij(K, map, dist);
		dij(K, remap, redist);

		for (int i = 1; i < N + 1; i++) {
			if (maxDistance < dist[i] + redist[i]) {
				maxDistance = dist[i] + redist[i];
			}
		}

		System.out.println(maxDistance);

	}

	public static void dij(int start, int[][] map, int[] dist) {

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.offer(start);
		dist[start] = 0;

		while (!pq.isEmpty()) {

			int x = pq.poll();

			for (int i = 1; i < N + 1; i++) {

				if (dist[i] > map[x][i] + dist[x]) {
					dist[i] = map[x][i] + dist[x];
					pq.offer(i);
				}

			}

		}

	}

}
