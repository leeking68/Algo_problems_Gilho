package Problems;

// 백준 2667 단지번호 붙이기 DFS  

import java.awt.Point;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

public class boj2667no79 {
	static int map[][];
	static int N;

	private static boolean isInRange(int x, int y) {
		return (0 <= x && x < N) && (0 <= y && y < N);
	}

	public static int dfs(int st, int st2) {
		int cnt = 1, ax, ay, dx[] = { -1, 1, 0, 0 }, dy[] = { 0, 0, -1, 1 };
		map[st][st2] = 0;
		Stack<Point> stk = new Stack<>();
		stk.push(new Point(st, st2));

		while (!stk.isEmpty()) {
			int x = stk.peek().x;
			int y = stk.pop().y;
			for (int i = 0; i < 4; i++) {
				ax = x + dx[i];
				ay = y + dy[i];
				if (isInRange(ax, ay) && map[ax][ay] == 1) {
					map[ax][ay] = 0;
					cnt++;
					stk.push(new Point(ax, ay));

				}
			}

		}

		return cnt;

	}

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		N = in.nextInt();

		map = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				map[i][j] = in.nextInt();
			}
		}

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (map[i][j] == 1)

					pq.offer(dfs(i, j));

			}
		}

		StringBuilder res = new StringBuilder(pq.size());
		System.out.println(pq.size());
		while (!pq.isEmpty())
			res.append(pq.poll() + " ");
		
		System.out.println(res);

	}

}
