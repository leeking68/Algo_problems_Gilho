package Problems;

/**
 * 
 * 백 1238번 파티 

 * 
 *	다익스트라 
 *
 */

import java.util.Scanner;
import java.util.PriorityQueue;

public class Boj1238dij {

	public static int N, M, X, INF = 100 * 1000 + 1, map[][], remap[][], dist[], redist[];

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		M = in.nextInt();
		X = in.nextInt();
		
		
		 map = remap = new int[1001][1001];
		 dist = redist = new int[1001];

		init(map,remap,dist,redist);
		
		for (int i = 0; i < M; i++) {
			int from = in.nextInt();
			int to = in.nextInt();
			int w = in.nextInt();
			map[from][to] = remap[to][from] = w;
		}
		
		 dij(X, map, dist);
		 dij(X, remap, redist);

		int max = 0;

		for (int i = 1; i < N+1; i++) {
			System.out.println(dist[i] + " :  " + redist[i]);
			if (max < dist[i] + redist[i]) {
				max = dist[i] + redist[i];
			}
		}

		System.out.println(max);
	}

	public static void init(int[][] map, int[][] remap, int[] dist, int[] redist) {

		for (int i = 0; i < N+1; i++) {
			dist[i] = redist[i] = INF;
			for (int j = 0; j < N+1; j++) {
				map[i][j] = remap[i][j] = INF;

			}
		}

	}

	public static void dij(int start, int[][] map, int[] dist) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();

		map[start][start] = 0;
		dist[start] = 0;
		pq.offer(start);

		while (!pq.isEmpty()) {
			int x = pq.poll();
			for (int i = 1; i < N+1; i++) {
				if (dist[i] > map[x][i] + dist[x]) {
					dist[i] = map[x][i] + dist[x];
					System.out.println(dist[i]);
					pq.offer(i);
				}
			}

		}
		
	}
}
