package Problems;
/**
 * 
 * 백준 2193 이친수
 *  
 *
 */

import java.util.Scanner;
public class Boj2193dp2 {
	public static int N;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		int[][] dp = new int[N+1][N+1];
		int[] d = new int[N+1];
	
		solve1(dp);
		solve2(d);
	}
	
	public static void solve1(int[][] dp) {
		

		dp[1][0] = 0;
		dp[1][1] = 1;
		for(int i = 2; i <= N; i++) {
			
			dp[i][0] = dp[i-1][0] + dp[i-1][1];
			dp[i][1] = dp[i-1][0];
		} 
		
		System.out.println(dp[N][0] + dp[N][1]);
		
		
		
	}
	
	
	public static void solve2(int[] d) {
	
		d[1] = 1;
		d[2] = 1;
		for(int i = 3; i <= N; i++) {
			d[i] = d[i-1] + d[i-2];
		}
		
		System.out.println(d[N]);
	}

}
