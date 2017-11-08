package Problems;

/**
 * 
 * 백준 2225 합분해  
 *
 */
import java.util.Scanner;

public class Boj2225dp2 {

	public static int n, k;
	public static int mod = 1000000000;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		n = in.nextInt();
		k = in.nextInt();

		long[][] dp = new long[k + 1][n + 1];

		dp[0][0] = 1;

		for (int i = 1; i <= k; i++) {

			for (int j = 0; j <= n; j++) {
				for (int l = 0; l <= j; l++) {
					dp[i][j] += dp[i - 1][j - l];
					dp[i][j] %= mod;
				}
			}

		}

		System.out.println(dp[k][n]);
	}

}
