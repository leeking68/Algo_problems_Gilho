package Problems;

import java.util.Arrays;
/**
 * 
 *
 *  백준 10492펠드롬 
 * 
 *
 */
import java.util.Scanner;

public class Boj10942dpFEl {

	public static int t, n, arr[], dp[][];

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		arr = new int[n + 1];
		dp = new int[n + 1][n + 1];

		for (int i = 1; i <= n; i++) {

			arr[i] = in.nextInt();
			Arrays.fill(dp[i], -1);

		}
		t = in.nextInt();
		StringBuilder sb = new StringBuilder("");
		while (t-- > 0) {

			int a = in.nextInt();
			int b = in.nextInt();

			int ck = solve(a, b);

			sb.append(ck);
			sb.append("\n");

		}

		System.out.println(sb);
	}

	public static int solve(int i, int j) {
		if (i == j) {
			return 1;
		}

		else if (i + 1 == j) {
			if (arr[i] == arr[j])
				return 1;
		}
		
		
		if (dp[i][j] != -1) {
			return dp[i][j];
		} else if (arr[i] != arr[j]) {

			return dp[i][j] = 0;
		} else
			return dp[i][j] = solve(i + 1, j - 1);
	}

}
