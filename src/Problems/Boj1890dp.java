package Problems;

//백준 1890 점프 dp 

import java.awt.Point;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Boj1890dp {

	public static int n, map[][], dist[][], dx[] = { 1, 0 }, dy[] = { 0, 1 };

	public static void main(String[] args) {
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

		dp(0, 0);

		System.out.println(dist[n - 1][n - 1]);
	}

	public static boolean isRange(int nx, int ny) {
		return (nx < n && nx >= 0 && ny < n && ny >= 0);
	}

	public static void dp(int a, int b) {
		Queue<Point> q = new LinkedList<>();
		q.offer(new Point(a, b));
		dist[0][0] = 1;
		int x, y;
		while (!q.isEmpty()) {
			x = q.peek().x;
			y = q.poll().y;

			int jump = map[x][y];

			int nx = x + jump;
			if (isRange(nx, y)) {
				dist[nx][y] += dist[x][y];
				q.offer(new Point(nx, y));
			}
			int ny = y + jump;
			if (isRange(x, ny)) {
				dist[x][ny] += dist[x][y];
				q.offer(new Point(x, ny));
			}

		}

	}

}
