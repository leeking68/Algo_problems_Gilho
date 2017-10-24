package Problems;

// 백준 14502 벽세우기 삼성문제 

import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

public class Boj14502sssw {

	public static int dx[] = { -1, 1, 0, 0 }, dy[] = { 0, 0, -1, 1 };
	public static int n, m, map[][], total, totalV, result = -1;
	public static PriorityQueue<virus> vq;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();
		map = new int[n][m];
		total = n * m;
		totalV = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				map[i][j] = in.nextInt();
				if (map[i][j] == 1 || map[i][j] == 2) {
					total--;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (map[i][j] == 0) {
					System.out.println("i");

					map[i][j] = 1;
					for (int i2 = i; i2 < n; i2++) {
						for (int j2 = j + 1; j2 < m; j2++) {
							if (map[i][j] == 0) {
								System.out.println("ii");

								map[i][j] = 1;
								for (int i3 = i2; i3 < n; i3++) {
									for (int j3 = j2 + 1; j3 < m; j3++) {
										if (map[i][j] == 0) {
											map[i][j] = 1;
											totalV = checkVirus();
											System.out.println("iii");
											map[i][j] = map[i2][j2] = map[i3][j3] = 0;
											if (result < total - totalV) {
												result = total - totalV;
											}

										}
									}
								}

							}
						}
					}
				}
			}
		}
		
		System.out.println(result);

	}

	public static int checkVirus() {
		int numV = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (map[i][j] == 2) {
					numV += bfs(i, j);
				}
			}
		}

		return numV;

	}

	public static int bfs(int x, int y) {
		int checkV = 0;
		Queue<virus> q = new LinkedList<virus>();
		q.offer(new virus(x, y));
		map[x][y] = 2;
		while (!q.isEmpty()) {
			virus v = q.poll();

			for (int i = 0; i < 4; i++) {
				int nx = v.x + dx[i];
				int ny = v.y + dy[i];

				if (isRange(nx, ny) && map[nx][ny] == 0) {
					map[nx][ny] = 2;
					checkV++;
					q.offer(new virus(nx, ny));
				}
			}

		}
		return checkV;

	}

	public static boolean isRange(int x, int y) {
		return x < n && x >= 0 && y < m && y >= 0;
	}

}

class virus {
	int x;
	int y;

	public virus(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
