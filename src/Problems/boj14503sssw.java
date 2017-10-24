package Problems;

// 백준 14503 삼성로봇청소

import java.util.Scanner;

public class boj14503sssw {

	public static int n, m, room[][], d, dx[] = { -1, 0, 1, 0 }, dy[] = { 0, 1, 0, -1 }, cnt = 0;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();
		int r = in.nextInt();
		int c = in.nextInt();
		d = in.nextInt();
		room = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				room[i][j] = in.nextInt();
			}
		}

		while (true) {
			if (room[r][c] == 0) {
				cnt++;
				room[r][c] = 2;
			}

			boolean check = false;

			for (int i = 0; i < 4; i++) {
				int nextD = (d - 1 + 4) % 4;
				int nextR = r + dx[nextD];
				int nextC = r + dy[nextD];

				if (room[nextR][nextC] == 0) {
					r = nextR;
					c = nextC;
					d = nextD;
					check = true;
					break;
				} else {
					d = nextD;
				}

			}

			if (!check) {

				if (room[r - dx[d]][c - dy[d]] == 1) {
					System.out.println(cnt);
					break;

				} else {
					r = r - dx[d];
					c = c - dy[d];
				}

			}

		}

	}

}
