package Problems;

import java.util.Scanner;

public class Boj14722dp {

	public static int n;
	public static int[][] arr;
	public static int[][][] dp;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		n = in.nextInt();
		arr = new int[n][n];
		// 3번째는 우유 넘버
		dp = new int[n][n][3];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = in.nextInt();
			}
		}

		milkDp();

		System.out.println(Math.max(dp[n - 1][n-1][0], Math.max(dp[n - 1][n-1][1], dp[n-1][n - 1][2])));
		in.close();

	}

	public static void milkDp() {

		if (arr[0][0] == 0) {
			dp[0][0][0] = 1;
		}
		for (int i = 1; i < n; i++) {

			int milkNum = arr[0][i];

			dp[0][i][0] = milkNum == 0 ? dp[0][i - 1][2] + 1 : dp[0][i - 1][0];
			dp[0][i][1] = milkNum == 1 && dp[0][i][2] < dp[0][i][0] ? dp[0][i - 1][0] + 1 : dp[0][i - 1][1];
			dp[0][i][2] = milkNum == 2 && dp[0][i][0] < dp[0][i][1] ? dp[0][i - 1][1] + 1 : dp[0][i - 1][2];
		}

		for (int i = 1; i < n; i++) {

			int milkNum = arr[i][0];

			dp[i][0][0] = milkNum == 0 ? dp[i-1][0][2] + 1 : dp[i-1][0][0];
			dp[i][0][1] = milkNum == 1 && dp[i][0][2] < dp[i][0][0] ? dp[i-1][0][0] + 1 : dp[i-1][0][1];
			dp[i][0][2] = milkNum == 2 && dp[i][0][0] < dp[i][0][1] ? dp[i-1][0][1] + 1 : dp[i-1][0][2];
		}
		
		for(int i = 1; i < n; i++) {
			for(int j = 1; j < n; j++) {
				int milkNum = arr[i][j];

				dp[i][j][0] = milkNum == 0 
				? Math.max(dp[i][j - 1][2] + 1,dp[i-1][j][2]+1)
				: Math.max(dp[i][j-1][0], dp[i-1][j][0]);
				dp[i][j][1] = milkNum == 1 && dp[i][j][2] < dp[i][j][0] 
				? Math.max(dp[i][j - 1][0] + 1 , dp[i-1][j][0]+1 )
				: Math.max(dp[i][j-1][1], dp[i-1][j][1]);
				dp[i][j][2] = milkNum == 2 && dp[i][j][0] < dp[i][j][1] 
				? Math.max(dp[i][j - 1][1] + 1 , dp[i-1][j][1]+1 )
				: Math.max(dp[i][j-1][2], dp[i-1][j][2]);
			}
		}

	}

}
