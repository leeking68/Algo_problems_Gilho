package Problems;

import java.util.Scanner;

public class Boj2638dfs2 {

	public static int N, M, map[][];
	public static int[] dx = { -1, 1, 0, 0 }, dy = { 0, 0, -1, 1 };

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		M = in.nextInt();

		map = new int[N][M];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				map[i][j] = in.nextInt();
			}
		}

		
		int i = 0;
		for(i = 0; !reMap(); i++) {
			dfs(0,0);
		}
		System.out.println(i);

	}

	public static boolean reMap() {

		int check = 0;

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				 if (map[i][j] == 1|| map[i][j] == 2) {
					map[i][j] = 1;
					check++;
				} else {
					map[i][j] = 0;
				}
			}
		}
		
		return check == 0;
	}

	public static void dfs(int x, int y) {

		map[x][y] = -1;

		for (int h = 0; h < 4; h++) {

			int nx = x + dx[h];
			int ny = y + dy[h];

			if (isRange(nx, ny)) {
				if (map[nx][ny] > 0) {
					map[nx][ny]++;
				} else if (map[nx][ny] == 0) {
					dfs(nx, ny);
				}

			}

		}

	}

	public static boolean isRange(int x, int y) {
		return x < N && x >= 0 && y < M && y >= 0;
	}
}
