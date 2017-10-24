package Problems;

// no 87 1937 욕심쟁이 판다 dp 

import java.util.Scanner;

public class Boj1937dp {

	static int n, cnt, max = 1;
	static int map[][];
	static int dist[][];
	static int dx[] = { 0, 0, -1, 1 }, dy[] = { 1, -1, 0, 0 };

	public static void dp(int x, int y) {

		for (int k = 0; k < 4; k++) {
			int nx = x + dx[k];
			int ny = y + dy[k];

			if (isRange(nx, ny) && canMove(x, y, nx, ny)) {
				dist[nx][ny] = dist[x][y] + 1;
				if (max < dist[nx][ny]) {
					max = dist[nx][ny];
					dp(nx, ny);
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
				dist[i][j] = 0;
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (dist[i][j] == 0) {
					dist[i][j] = 1;
					dp(i, j);
				}
			}
		}

		in.close();

		System.out.println(max);

	}

	public static boolean isRange(int x, int y) {
		return (x < n && x >= 0) && (y < n && y >= 0);
	}

	public static boolean canMove(int x, int y, int ax, int ay) {
		return (map[x][y] < map[ax][ay]) && (dist[x][y] + 1 > dist[ax][ay]);
	}

}
