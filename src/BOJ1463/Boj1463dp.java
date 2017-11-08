package Problems;

/**
 * 
 *
 * 백준 1463 1로 만들기 
 * 
 * 풀이법 : 동적 계획법 
 * 
 * 
 *
 */
import java.util.Scanner;

public class Boj1463dp {
	public static int N,dp[];
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		dp = new int[N+1];
		
		dp[1] = 0;
		
		for(int i = 2; i < N+1; i++) {
		
			dp[i] = dp[i-1] + 1;
			
			if(i%3==0&&dp[i] > dp[i/3]+1) {
				dp[i] = dp[i/3] + 1;
			}
			
			if(i%2==0&&dp[i]>dp[i/2]+1) {
				dp[i] = dp[i/2] + 1;
			}
			
			
		}
		
		System.out.println(dp[N]);
		
		System.out.println(solve(N));
		
	}
	
	public static int solve(int n) {
		
		if(n==1) return 0;
		
		//memoization
		if(dp[n] > 0) return dp[n];
		
		dp[n] = solve(n-1) + 1;
		
		if(n%2==0) {
			int temp = solve(n/2) +1;
			
			if(dp[n] > temp) dp[n] = temp;
		}
		
		if(n%3==0) {
			int temp = solve(n/3) +1;
			
			if(dp[n] > temp) dp[n] = temp;
		}
		
		return dp[n];
		
	}
	
	

}
