package Problems;

// 백준 2468 안전영영 dp

import java.util.Scanner;
import java.awt.Point;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;

public class Boj2468dp {

	public static int n, map[][], cnt = 0, ans = 1, dx[] = { -1, 1, 0, 0 }, dy[] = { 0, 0, -1, 1 };
	public static boolean visit[][];

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		map = new int[n][n];
	

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				map[i][j] = in.nextInt();
			}
		}

		for (int h = 1; h <= 100; h++) {
			cnt = 0;
			visit = new boolean[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (map[i][j] > h && !visit[i][j]) {
						++cnt;
						dp(i,j,h);
					}

				}
			}
			if(ans < cnt) {
				ans = cnt;
			}
		}
		
		

		
		System.out.println(ans);

	}

	public static void dp(int x, int y, int h ) {

		if (visit[x][y]) {
			return;
		}

		visit[x][y] = true;

		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (0 <= nx && nx < n && 0 <= ny && ny < n) {
				if (map[nx][ny] > h && !visit[nx][ny]) {
					dp(nx, ny, h);
				}
			}
		}


	}

	public static boolean isRange(int nx, int ny) {

		return (nx < n && nx >= 0 && ny >= 0 && ny < n);
	}

	class Node {
		int x, y;

		public Node(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

}
