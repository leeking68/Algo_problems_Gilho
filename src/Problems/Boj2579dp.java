package Problems;
/**
 * 
 * 백준 2579 계단오르기 
 * 
 * 동적계획법 
 * 
 * 
 */

import java.util.Scanner;
public class Boj2579dp {
	public static int n,arr[],dp[];
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		arr = new int[n+1];
		dp = new int[n+1];
		
		for(int i = 1; i <=n; i++) {
			
			arr[i] = in.nextInt();
		}
		
		dp[1] = arr[1];
		dp[2] = arr[1] + arr[2];
		for(int i = 3; i <=n; i++) {
			
			dp[i] = Math.max(dp[i-2]+arr[i], dp[i-3]+arr[i-1]+arr[i]);
			
		}
		
		System.out.println(dp[n]);
	}

}
