package Problems;

//백준 1520 dpdp
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Boj1520dpdp {

	public static int n, m, map[][], down[][], dx[] = { -1, 1, 0, 0 }, dy[] = { 0, 0, -1, 1 };

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		m = in.nextInt();
		n = in.nextInt();
		map = new int[m][n];
		down = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				map[i][j] = in.nextInt();
				down[i][j] = -1;
			}
		}

		dp(0,0);

		System.out.println(down[m - 1][n - 1]);

	}

	public static int dp(int x, int y) {

		if (x == m - 1 && y == n - 1) {
			return 1;
		}

		// momorization

		if (down[x][y] > -1) {
			return down[x][y];
		}

		int temp = 0, nextX = 0, nextY = 0;
		for (int i = 0; i < 4; i++) {
			nextX = x + dx[i];
			nextY = y + dy[i];

			if (isRange(nextX, nextY) && map[nextX][nextY] < map[x][y]) {
				temp += dp(nextX, nextY);
			}
		}

		return down[x][y] = temp;

	}

	public static boolean isRange(int x, int y) {
		return x < m && x >= 0 && y < n && y >= 0;
	}

}

class Down {
	int x, y;

	public Down(int x, int y) {
		this.x = x;
		this.y = y;

	}
}
