package Problems;

//백준 1012dfs 
import java.util.Scanner;

public class Boj1012dfs {

	public static int t, m, n, k, num, map[][], dx[] = { -1, 1, 0, 0 }, dy[] = { 0, 0, -1, 1 };

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		t = in.nextInt();

		for (int h = 0; h < t; h++) {
			m = in.nextInt();
			n = in.nextInt();
			k = in.nextInt();
			map = new int[50][50];
			for (int i = 0; i < k; i++) {
				int x = in.nextInt();
				int y = in.nextInt();
				map[x][y] = 1;
			}
			for (int i = 0; i <= m; i++) {
				for (int j = 0; j <= n; j++) {
					if (map[i][j] != 0) {
						num++;
						dps(i, j);

					}
				}
			}

			System.out.println(num);

		}
		in.close();

	}

	public static void dps(int x, int y) {
		map[x][y] = 0;
		int nx, ny;
		for (int i = 0; i < 4; i++) {
			nx = x + dx[i];
			ny = y + dy[i];

			if (isRange(nx, ny) && map[nx][ny] == 1) {
				dps(nx, ny);
			}

		}

	}

	public static boolean isRange(int nx, int ny) {
		return (nx < m && nx >= 0 && ny < n && ny >= 0);

	}

}
