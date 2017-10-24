package Problems;

import java.util.Scanner;

public class Boj14720dp {

	public static int n;
	public static int[] arr;
	public static int[][] dp;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		n = in.nextInt();
		arr = new int[n];
		dp = new int[n][n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}

		milkDp();

		System.out.println(Math.max(dp[n - 1][1], Math.max(dp[n - 1][0], dp[n - 1][2])));
		in.close();

	}

	public static void milkDp() {

		for (int i = 1; i < n; i++) {

			int milkNum = arr[i];
			if (arr[0] == 0) {
				dp[0][0] = 1;
			}

			dp[i][0] = milkNum == 0 ? dp[i - 1][2] + 1 : dp[i - 1][0];
			dp[i][1] = milkNum == 1 && dp[i][2] < dp[i][0] ? dp[i - 1][0] + 1 : dp[i - 1][1];
			dp[i][2] = milkNum == 2 && dp[i][0] < dp[i][1] ? dp[i - 1][1] + 1 : dp[i - 1][2];
		}

	}

}
