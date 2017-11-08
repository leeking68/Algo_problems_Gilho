package Problems;

/**
 * 
 * 
 * 백준 11048 이동하기 
 *  
 *
 */
import java.util.Scanner;

public class Boj11048dp {

	public static int n, m;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();

		int[][] arr = new int[n + 1][m + 1];
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		int[][] solve4 = new int[n + 1][m + 1];
		
		solve1(arr);
		solve2(arr);
		solve3(arr);
		int temp = solve4(arr,solve4,n,m);
		System.out.println(temp);

	}

	public static void solve1(int[][] arr) {

		int[][] dp = new int[n + 1][m + 1];

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				dp[i][j] = Math.max(dp[i - 1][j], Math.max(dp[i - 1][j - 1], dp[i][j - 1])) + arr[i][j];
				System.out.println("arr" + arr[i][j] + "    :   dp"  + dp[i][j]);
			}
		}

		System.out.println(dp[n][m]);

	}

	public static void solve2(int[][] arr) {
		int[][] dp = new int[n + 1][m + 1];

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {

				if ( j + 1 <=m && dp[i][j + 1] < dp[i][j] + arr[i][j + 1]) {
					dp[i][j + 1] = dp[i][j] + arr[i][j + 1];
				}

				if (i + 1 <= n && j + 1 <= m && dp[i + 1][j + 1] < dp[i][j] + arr[i + 1][j + 1]) {
					dp[i+1][j + 1] = dp[i][j] + arr[i + 1][j + 1];
				}

				if (i + 1 <=n && dp[i + 1][j] < dp[i][j] + arr[i + 1][j]) {
					dp[i+1][j] = dp[i][j] + arr[i + 1][j];
				}
			}
		}

		System.out.println(dp[n][m]);
	}

	public static void solve3(int[][] arr) {

		int[][] dp = new int[n + 1][m + 1];

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]) + arr[i][j];
			}
		}

		System.out.println(dp[n][m]);

	}

	public static int solve4(int[][] arr, int[][] dp, int x, int y) {

		if (x == 1 && y == 1) {
			return arr[1][1];
		}
		if (x < 1 || y < 1) {
			return 0;
		}

		if (dp[x][y] > 0) {
			return dp[x][y];
		}

		dp[x][y] = solve4(arr, dp, x - 1, y) + arr[x][y];
		int temp = solve4(arr, dp, x, y - 1) + arr[x][y];

		if (dp[x][y] < temp) {

			dp[x][y] = temp;
		}

		return dp[x][y];

	}

}
