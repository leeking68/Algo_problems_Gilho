package Problems;

// no 89 숫자삼각형 dp

import java.util.Scanner;
import java.util.Queue;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Boj1932dp {

	public static int n, map[][];

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		n = in.nextInt();
		map = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				map[i][j] = 0;
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				map[i][j] = in.nextInt();
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println(" ");
		}
		
		System.out.println(maxSum());
	}

	public static int maxSum() {
		int max = 0;

		Queue<Node> q = new LinkedList<>();
		q.add(new Node(0, 0));

		while (q.isEmpty()) {
			Node n = q.poll();
			int temp = 0;
			for (int i = 0; i < 2; i++) {
				if (map[n.x][n.y] < map[n.x + 1][n.y]) {
					temp = map[n.x][n.y];
					map[n.x][n.y] = map[n.x + 1][n.y];
					map[n.x + 1][n.y] = temp;
					q.add(new Node(n.x + 1, n.y));
				} else if (map[n.x][n.y] < map[n.x + 1][n.y + 1]) {
					temp = map[n.x][n.y];
					map[n.x][n.y] = map[n.x + 1][n.y + 1];
					map[n.x + 1][n.y + 1] = temp;
					q.add(new Node(n.x + 1, n.y + 1));

				}
			}

		}

		for (int i = 0; i < n; i++)
			max += map[n - 1][i];

		return max;
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