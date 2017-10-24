package Problems;

// no 82 1251알고스팟 

import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Comparator;

public class Boj1261dij {

	static int n, m, INF = 9999999;
	static int map[][];
	static final int[] dx = { 0, 0, -1, 1 }, dy = { 1, -1, 0, 0 };

	public static int dij(int start, int end) {
		int dist[][] = new int[n][m];

		init(dist, 100000);

		dist[start][end] = dist[end][start] = 0;

		PriorityQueue<Elements> pq = new PriorityQueue<>(new Comparator<Elements>() {
			public int compare(Elements o1, Elements o2) {
				return Integer.compare(o1.w, o2.w);
			}
		});

		pq.offer(new Elements(start, end, dist[start][end]));
		while (!pq.isEmpty()) {
			int x = pq.peek().x;
			int y = pq.peek().y;
			int w = pq.poll().w;
			for (int i = 0; i < 4; i++) {
				int ax = x + dx[i];
				int ay = y + dy[i];
				if (ax < n && ax >= 0 && ay < m && ay >= 0 && dist[ax][ay] > w + map[ax][ay]) {
					dist[ax][ay] = w + map[ax][ay];
					pq.offer(new Elements(ax, ay, dist[ax][ay]));
				}

			}
		}

		return dist[n - 1][m - 1];
	}

	private static void init(int map[][], int val) {
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++) {
				map[i][j] = val;
			}
	}

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		n = in.nextInt();
		m = in.nextInt();

		map = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				map[i][j] = in.nextInt();
			}

		}

		in.close();

		System.out.println(dij(0, 0));

	}
}

class Elements {
	int x, y, w; // x좌표, y좌표, 이동비용 ( 벽의 수 )

	public Elements(int x, int y, int w) {
		this.x = x;
		this.y = y;
		this.w = w;
	}
}
