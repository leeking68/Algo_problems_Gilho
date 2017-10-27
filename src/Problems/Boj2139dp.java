package Problems;

/**
 * 
 * 백준 2139  
 *
 * 이친수 
 * 
 *
 */
import java.util.Scanner;

public class Boj2139dp {
	public static int N;
	public static long[] dp;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		dp = new long[N + 1];
		dp[0] = 0;
		dp[1] = 1;

		for (int i = 2; i < N + 1; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		System.out.println(dp[N]);
	}

}
