package Problems;

//백준 1149 동적계획법 두번

import java.util.Scanner;

public class Boj1149dp2 {

	public static int N, dp[][], arr[][];

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		N = in.nextInt();

		dp = new int[1001][3];
		arr = new int[1001][3];

		for (int i = 0; i < N; i++) {

			for (int j = 0; j < 3; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		
		rgbDistanceCal();
		
	}
	
	public static void rgbDistanceCal() {
		
		dp[0][0] = arr[0][0];
		dp[0][1] = arr[0][1];
		dp[0][2] = arr[0][2];
		
		for(int i = 1; i < N; i++) {
		
			dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2]) + arr[i][0];
			dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2]) + arr[i][1];
			dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1]) + arr[i][2];
		}
		
		int result = min(dp[N-1][0],min(dp[N-1][1],dp[N-1][2]));
		
		System.out.println(result);
		
	}
	
	public static int min(int x , int y) {
		
		if(x > y) {
			return y;
		} else {
			return x;
		}
		
	}

}
