package Problems;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Boj1520dp {

	public static int n, m, cnt = 0;
	public static int[][] map;
	public static boolean[][] visit;
	public static int[] dx = { 0, 0, 1, -1 };
	public static int[] dy = { 1, -1, 0, 0 };
	public static Scanner in = new Scanner(System.in);

	public static void main(String args[]) {
		n = in.nextInt();
		m = in.nextInt();
		map = new int[n][m];
		visit = new boolean[n][m];
		System.out.println(dp());
	}

	public static boolean isRange(int nx, int ny) {

		return (nx < n && ny < m && nx >= 0 && ny >= 0);

	}

	public static boolean canMove(int nx, int ny, int x, int y) {
		return (map[nx][ny] < map[x][y]);
	}

	public static int dp() {
		init();

		Queue<Node> q = new LinkedList<>();

		q.add(new Node(0, 0));

		while (!q.isEmpty()) {
			Node node = q.poll();
			visit[node.x][node.y] = true;
			for (int i = 0; i < 4; i++) {
			
				int nx = node.x + dx[i];
				int ny = node.y + dy[i];
				System.out.println(nx + " : " + ny);
				if (isRange(nx, ny) && canMove(nx, ny, node.x, node.y)&&visit[nx][ny]==false) {

					if (nx == n-1 && ny == m-1) {
						cnt++;
					}
					q.add(new Node(nx, ny));

				}
			}
		}

		return cnt;
	}

	public static void init() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				map[i][j] = in.nextInt();
				visit[i][j] = false;
			}
		}
	}

	// 구조체
	static class Node {
		int x;
		int y;

		public Node(int x, int y) {
			this.x = x;
			this.y = y;
		}

	}

}
