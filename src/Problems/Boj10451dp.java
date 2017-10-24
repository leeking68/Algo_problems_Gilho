package Problems;

//백준 14051 dfs

import java.util.Scanner;

public class Boj10451dp {

	public static int START = 0;
	public static int arr[];
	public static boolean visited[];

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int test = 0; test < T; test++) {
			int cnt = 0;
			int n = in.nextInt();
			arr = new int[n + 1];
			visited = new boolean[n + 1];
			for (int i = 1; i < n + 1; i++) {
				arr[i] = in.nextInt();
			}

			for (int i = 1; i < n + 1; i++) {

				START = i;

				if (!visited[i]) {
					dfs(i);
					cnt++;
				}

			}
			
			System.out.println(cnt);

		}
		in.close();

	}

	public static void dfs(int i) {

		int to = arr[i];

		if(!visited[to]) {
		visited[to] = true;
			
			if(to == START) {
				return;
			} else {
				dfs(to);
			}
		
		}
	}

}
