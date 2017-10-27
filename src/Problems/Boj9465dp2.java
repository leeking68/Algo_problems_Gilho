package Problems;

/**
 * 
 * 백준 9465 스티커 문제 

 * 
 * 동적계획법 
 * 
 * 왜 틀리는지 이유를 모르겠음,,
 * 
 */
import java.util.Scanner;

public class Boj9465dp2 {

	public static int n, arr[][], dp[][];

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int test_case = 0; test_case < T; test_case++) {
			n = in.nextInt();

			arr = new int[2][100001];
			dp = new int[2][100001];

			for (int i = 0; i < 2; i++) {
				for (int j = 1; j < n + 1; j++) {
					arr[i][j] = in.nextInt();
				}
			}

			stiker();
		}

	}

	public static void stiker() {	

		dp[0][0] = 0;
		dp[1][0] = 0;
		dp[0][1] = arr[0][1];
		dp[1][0] = arr[1][1];

		for (int i = 2; i < n + 1; i++) {

			dp[1][i] =  Math.max(dp[0][i - 2], dp[0][i - 1]) + arr[1][i];
			dp[0][i] =  Math.max(dp[1][i - 2], dp[1][i - 1]) + arr[0][i];

		}

		int result = Math.max(dp[1][n], dp[0][n]);
		System.out.println(result);

	}

}
