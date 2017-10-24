package Problems;

// 85 2665 미로만들기 dp 

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Boj2665dp {

	static int n, INF = 999999;
	static int dist[][];
	static int map[][];
	static int dx[] = { -1, 1, 0, 0 };
	static int dy[] = { 0, 0, -1, 1 };

	public static void dp(int x, int y) {
		dist[0][0] = 0;
		Queue<Pair> q = new LinkedList<>();
		q.add(new Pair(x, y));
		

		while (!q.isEmpty()) {
			Pair p = q.poll();

			for (int i = 0; i < 4; i++) {

				int nx = p.x + dx[i];
				int ny = p.y + dy[i];

				if (nx >= 0 && nx < n && ny >= 0 && ny < n && map[nx][ny] == 1 && dist[nx][ny] > dist[p.x][p.y]) {
					dist[nx][ny] = dist[p.x][p.y];
					q.add(new Pair(nx, ny));
				} else if (nx >= 0 && nx < n && ny >= 0 && ny < n && map[nx][ny] == 0
						&& dist[nx][ny] > dist[p.x][p.y] + 1) {
					dist[nx][ny] = dist[p.x][p.y] + 1;
					q.add(new Pair(nx, ny));
				}

			}
		}

	}

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		n = in.nextInt();

		map = new int[n][n];
		dist = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				map[i][j] = in.nextInt();
				dist[i][j] = INF;
			}
		}
		
		dp(0,0);

		System.out.print(dist[n - 1][n - 1]);

	}

	static class Pair {
		int x, y;

		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}
