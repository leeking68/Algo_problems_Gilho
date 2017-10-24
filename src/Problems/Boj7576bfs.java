package Problems;

// 백준 7576bfs

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Boj7576bfs {

	public static int m, n, num = 0, map[][], dx[] = { -1, 1, 0, 0 }, dy[] = { 0, 0, -1, 1 };
	public static Queue<Node> q = new LinkedList<Node>();

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();
		map = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				map[i][j] = in.nextInt();
				if (map[i][j] == 1) {
					q.add(new Node(i, j, 0));
				}	
			}
		}

		bfs();

		int ans = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (map[i][j] > ans) {
					ans = map[i][j];
				} else if(map[i][j]==0) {
					System.out.println("-1");
					return;
				}
			}
		}

		if (ans != 0) {
			System.out.println(ans);}
		
		in.close();

	}

	public static void bfs() {
		while (!q.isEmpty()) {
			Node n = q.poll();
			int nx, ny;
			for (int i = 0; i < 4; i++) {
				nx = n.x + dx[i];
				ny = n.y + dy[i];

				if (isRange(nx, ny) && map[nx][ny] == 0) {
					q.add(new Node(nx, ny, n.c + 1));
					map[nx][ny] = n.c + 1;
				}
			}

		}

	}

	public static boolean isRange(int x, int y) {
		return x < m && x >= 0 && y < n && y >= 0;
	}

	static class Node {
		int x;
		int y;
		int c;

		public Node(int x, int y, int c) {
			this.x = x;
			this.y = y;
			this.c = c;
		}
	}

}
