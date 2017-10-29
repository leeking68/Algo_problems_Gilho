package Problems;

import java.util.Scanner;
import java.util.PriorityQueue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;

public class Boj2665dij {

	public static int N, map[][], dist[][], INF = 1000000000;
	public static int[] dx = { 0, -1, 0, 1 }, dy = { -1, 0, 1, 0 };
	public static boolean visited[][];

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		N = Integer.parseInt(br.readLine());

		map = new int[N][N];
		dist = new int[N][N];
		visited = new boolean[N][N];
		for (int i = 0; i < N; i++) {
			String line = br.readLine();
			for (int j = 0; j < N; j++) {
				dist[i][j] = INF;
				map[i][j] = line.charAt(j) - '0';
			}
		}

		dij(0, 0);

	}

	public static void dij(int x, int y) {
		PriorityQueue<Miro> pq = new PriorityQueue<Miro>(new Comparator<Miro>() {

			@Override
			public int compare(Miro m1, Miro m2) {
				return m1.w < m2.w ? -1:1;
			}

		});
		visited[x][y] = true;
		dist[0][0] = 0;
		pq.offer(new Miro(x, y, dist[x][y]));
		while (!pq.isEmpty()) {
			
			Miro m = pq.poll();

			if (m.x == N - 1 && m.y == N - 1) {
				break;
			}
			
			if (dist[m.x][m.y] < m.w) {
				continue;
			}
			
			for (int i = 0; i < 4; i++) {
				int nx = m.x + dx[i];
				int ny = m.y + dy[i];

				if(!isRange(nx,ny)) continue;
				if(visited[nx][ny]) continue;
				
					if (map[nx][ny] == 1) {

						if (dist[nx][ny] > dist[m.x][m.y]) {
							dist[nx][ny] = dist[m.x][m.y];
						}

					} else {

						if (dist[nx][ny] > dist[m.x][m.y] + 1) {
							dist[nx][ny] = dist[m.x][m.y] + 1;
						}

					}

					pq.offer(new Miro(nx, ny, dist[nx][ny]));
					visited[nx][ny] = true;
			}

		}

		System.out.println(dist[N - 1][N - 1]);

	}

	public static boolean isRange(int x, int y) {
		return x < N && x >= 0 && y < N && y >= 0;
	}

}

class Miro {
	int x;
	int y;
	int w;

	public Miro(int x, int y, int w) {
		this.x = x;
		this.y = y;
		this.w = w;
	}
}
