package Problems;

// 백준 9095 3,2,1의 조합 

import java.util.Arrays;
import java.util.Scanner;

public class Boj9095dp {

	public static int t, n, arr[], dp[];

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		t = in.nextInt();
		arr = new int[t];
		for (int i = 0; i < t; i++) {
			arr[i] = in.nextInt();
		}

		dp = new int[11];

		dp[0] = 1;
		dp[1] = 1;
		dp[2] = 2;

		for (int i = 0; i < t; i++) {
			n = arr[i];
			cal(n);
		}

	}

	public static void cal(int n) {

		for (int i = 3; i <= n; i++) {

			if (dp[i] == 0) {
				dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
			}
		}
		System.out.println(dp[n]);

	}

}
