package Problems;

// 2178 미로탐색 bfs

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class No73 {

	public static int[][] arr;
	public static boolean[][] visited;
	public static int n, m, cnt = 0;

	// 방향
	public static int[] dx = { 1, 0, -1, 0 };
	public static int[] dy = { 0, 1, 0, -1 };

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		n = in.nextInt();
		m = in.nextInt();

		arr = new int[n][m];
		visited = new boolean[n][m];

		for (int i = 0; i < n; i++) {
			String s = in.next();
			for (int j = 0; j < s.length(); j++) {
				arr[i][j] = s.charAt(j) - '0';
			}
		}

		bfs(0, 0);

		System.out.println(arr[n - 1][m - 1]);

	}

	public static void bfs(int x, int y) {
		Queue<Node> q = new LinkedList<Node>();
		q.add(new Node(x, y));

		while (!q.isEmpty()) {
			Node node = q.poll();
			visited[node.x][node.y] = true;

			for (int i = 0; i < 4; i++) {
				int nx = node.x + dx[i];
				int ny = node.y + dy[i];
				if (nx >= 0 && nx < n && ny >= 0 && ny < m && arr[nx][ny] == 1 && visited[nx][ny] == false) {
					q.add(new Node(nx, ny));
					arr[nx][ny] = arr[node.x][node.y] + 1;
				}
			}
		}

	}

	static class Node {
		int x;
		int y;

		Node(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}
	//				System.out.println("after nx:" + nx + "   node.x:" + node.x + "   dx[" + i + "] " + dx[i]);
	//				System.out.println("=======================================");
	//				System.out.println("after ny:" + ny + "   node.y:" + node.y + "   dx[" + i + "] " + dy[i]);
	//					System.out.println(nx + "," + ny + "}}}}}}" + node.x + "," + node.y);


