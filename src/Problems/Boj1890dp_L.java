package Problems;

//백준 1890 점프 dp 

import java.awt.Point;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Boj1890dp_L {

	public static int n, map[][] = new int[101][101], dist[][] = new int[101][101];

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				map[i][j] = in.nextInt();
			}
		}

		dp(0, 0);

		System.out.println(dist[n - 1][n - 1]);
	}

	public static boolean isRange(int nx, int ny) {
		return (nx < n && nx >= 0 && ny < n && ny >= 0);
	}

	public static void dp(int a, int b) {
		dist[0][0] = 1;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (dist[i][j] == 0 || (i == n - 1 && j == n - 1)) {
					continue;
				}

				int jump = map[i][j];
				int down = jump + i;
				int right = jump + j;

				if (down < n) {
					dist[down][j] += dist[i][j];
				}

				if (right < n) {
					dist[i][right] += dist[i][j];
				}

			}
		}
	}

}
