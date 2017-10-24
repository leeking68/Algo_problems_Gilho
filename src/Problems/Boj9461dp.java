package Problems;

//백준 9461 dp

import java.util.Scanner;

public class Boj9461dp {

	public static int t, n;
	public static long dp[];
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		t = in.nextInt();
		dp = new long[101];
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 1;
		for (int i = 0; i < t; i++) {
			n = in.nextInt();
			cal(n);
		}
	}

	public static void cal(int n) {

		for (int i = 3; i <= n; i++) {
			dp[i] = dp[i - 3] + dp[i - 2];
		}

		System.out.println(dp[n]);

	}

}
