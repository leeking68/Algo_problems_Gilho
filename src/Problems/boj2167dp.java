package Problems;

//백준 2162 dp

import java.util.Scanner;

public class boj2167dp {

	public static int n, m, arr[][],dp[][];

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();
		arr = new int[n + 1][300];
		dp = new int[n+1][300];
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				arr[i][j] = in.nextInt();
				dp[i][j] += arr[i][j] + dp[i][j-1];
			}
		}

		int k = in.nextInt();

		for (int c = 0; c < k; c++) {
			int i = in.nextInt();
			int j = in.nextInt();
			int x = in.nextInt();
			int y = in.nextInt();
			
			cal(i,j,x,y);
			
		}

	}

	public static void cal(int i, int j, int x, int y) {
		int sum = 0;
		
		for(int row = i; row <= x; row++) {
			sum += dp[row][y] - dp[row][j-1];
		}
		
		System.out.println(sum);
	}

}
