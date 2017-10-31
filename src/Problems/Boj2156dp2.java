package Problems;

/**
 *
 * 백준 2156 포도주 마시기 
 *
 *
 */

import java.util.Scanner;

public class Boj2156dp2 {

	public static int N, arr[], dp[];

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();

		arr = new int[N+1];
		dp = new int[N+1];

		for (int i = 1; i < N+1; i++) {
			arr[i] = in.nextInt();
		}
		
		System.out.println(dynamic(arr,dp,N));

	}
	
	public static int dynamic(int[] arr, int[] dp, int n) {
		
		if(n< 1) {
			return 0;
		} else if(n==1) {
			return arr[1];
		} else if(n==2) {
			return arr[1]+arr[2];
		}
		
		if(dp[n]> 0) {
			return dp[n];
		}
		
		
		dp[n] = Math.max(Math.max(dynamic(arr,dp,n-1),dynamic(arr,dp,n-2)+arr[n]), dynamic(arr,dp,n-3)+arr[n]+arr[n-1]);
		
		return dp[n];
		
	}

}
