package NewProblem;

import java.util.Scanner;

public class Bj14499dfs {
	public static int[][] map = new int[21][21];
	public static boolean[] visited = new boolean[21];
	public static int n;
	public static int ans = Integer.MAX_VALUE;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		n = in.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				map[i][j] = in.nextInt();
			}
		}
		dfs(0, 0);
		System.out.println(ans);
	}

	public static void dfs(int k, int len) {

		if (len == n / 2) {
			divTeam();
		} else {

			for (int i = k + 1; i < n + 1; i++) {
				if (!visited[i]) {
					visited[i] = true;
					dfs(i, len + 1);
				}
			}

		}

		visited[k] = false;

	}

	public static void divTeam() {

		int t1 = 1, t2 = 1;
		int[] team1 = new int[n / 2 + 1];
		int[] team2 = new int[n / 2 + 1];

		for (int i = 1; i < n + 1; i++) {
			if (visited[i]) {
				team1[t1++] = i;
			} else {
				team2[t2++] = i;
			}
		}

		int getSumTeam1 = getSum(team1);
		int getSumTeam2 = getSum(team2);
		int sum = Math.abs(getSumTeam1 - getSumTeam2);
		
		if (ans > sum) {
			ans = sum;
		}

	}

	public static int getSum(int[] team) {

		int sum = 0;
		int mid = n / 2;

		for (int i = 1; i <= mid; i++) {
			for (int j = i + 1; j <= mid; j++) {
				sum += map[team[i]][team[j]];
				sum += map[team[j]][team[i]];
			}
		}

		return sum;

	}

}
