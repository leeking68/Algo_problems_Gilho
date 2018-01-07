package Problems;

/**
 * 
 *
 * 백준 1520 내리막길 
 * 
 * 동적계획법 
 *
 */
import java.util.Scanner;

public class Boj1520dp2 {

	public static int n, m, map[][], d[][];
	public static int dx[] = { -1, 1, 0, 0 }, dy[] = { 0, 0, -1, 1 };

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();
		map = new int[n][m];
		d = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				map[i][j] = in.nextInt();
			}
		}
		
		System.out.println(cal(0,0));

	}

	public static int cal(int x, int y) {

		if (x == n - 1 && y == m - 1)
			return 1;
		if (d[x][y] > 0)
			return d[x][y];

		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx<n&&nx>=0&&ny<m&&ny>=0) {
				if(map[nx][ny] < map[x][y]) {
					d[x][y] += cal(nx,ny);
				}
			}
		}
		return d[x][y];
	}

}
