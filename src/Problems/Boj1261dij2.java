package Problems;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 
 * 백준 1261 알고스팟
 * 
 * 다익스트라 
 *
 */

import java.util.Scanner;

public class Boj1261dij2 {

	public static int[] dx = { -1, 1, 0, 0 }, dy = { 0, 0, -1, 1 };
	public static int N, M, dist[][], map[][];
	public static boolean visited[][];

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		M = in.nextInt();

		map = new int[N][M];
		dist = new int[N][M];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				map[i][j] = in.nextInt();
				dist[i][j] = 1000;
			}
		}

		dij(0, 0);

		System.out.println(dist[N - 1][M - 1]);
		in.close();
	}

	public static void dij(int x, int y) {
		PriorityQueue<Algospot> pq = new PriorityQueue<>(new Comparator<Algospot>() {

			public int compare(Algospot a1, Algospot a2) {
				return Integer.compare(a1.w, a2.w);
			}

		});

		dist[x][y] = map[x][y];
		pq.offer(new Algospot(x, y, dist[x][y]));

		while (!pq.isEmpty()) {
			int beforeX = pq.peek().x;
			int beforeY = pq.peek().y;
			int beforeW = pq.poll().w;

			for (int i = 0; i < 4; i++) {
				System.out.println("2");
				int nextX = beforeX + dx[i];
				int nextY = beforeY + dy[i];
				if (isRange(nextX, nextY) && dist[nextX][nextY] > map[nextX][nextY] + beforeW) {
					dist[nextX][nextY] = map[nextX][nextY] + beforeW;
					pq.offer(new Algospot(nextX, nextY, dist[nextX][nextY]));
				}

			}

		}

	}

	public static boolean isRange(int x, int y) {
		return x < N && x >= 0 && y < M && y >= 0;
	}

}

class Algospot {
	int x;
	int y;
	int w;

	public Algospot(int x, int y, int w) {
		this.x = x;
		this.y = y;
		this.w = w;
	}

}