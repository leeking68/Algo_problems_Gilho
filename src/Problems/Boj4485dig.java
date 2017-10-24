package Problems;

//백준 4485 dij

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Boj4485dig {

	public static int n, map[][], dist[][], dx[] = { -1, 1, 0, 0 }, dy[] = { 0, 0, -1, 1 }, prN = 0;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
//		while (n != 0) {
			n = in.nextInt();
			map = new int[n][n];
			dist = new int[n][n];
			prN++;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					map[i][j] = in.nextInt();
					dij();
				}
			}
		}
//	}

	public static void dij() {
		Queue<Node> q = new LinkedList<Node>();
		q.offer(new Node(0, 0));

		int x, y, nx, ny;
		while (!q.isEmpty()) {
			Node n = q.poll();
			x = n.x;
			y = n.y;

			for (int i = 0; i < 4; i++) {
				nx = x + dx[i];
				ny = y + dy[i];
				if (isRange(nx, ny) && dist[nx][ny] > dist[x][y] + map[nx][ny]) {
					dist[nx][ny] = dist[x][y] + map[nx][ny];
				}
			}

		}

		System.out.println("Problem" + prN + " :" + dist[n - 1][n - 1]);
	}

	public static boolean isRange(int x, int y) {
		return x < n && x >= 0 && y < n && y >= 0;
	}

	public static void init() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				dist[i][j] = 999999;
			}
		}
	}

	static class Node {
		int x;
		int y;

		public Node(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

}
