package Problems;

/**
 * 
 *  백준 2225 dp
 *  
 *  
 *
 */
import java.util.Scanner;
public class Boj2225dp {

	public static int N,K;
	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		N = in.nextInt();
		K = in.nextInt();
		
		long[][] dp = new long[N+1][N+1];
		
		for(int i = 0; i < N+1; i++) {
			for(int j = 0; j < N+1; j++) {
				dp[i][j] = 0;
			}
		}
		
		System.out.println(solve(N,K,dp));
		
	}
	public static long solve(int N, int K, long[][] dp) {
		
		if(K == 0) {
			
			if(N == 0) {
				
				return 1;
			}
			
			return 0;
		}
		
		if(dp[N][K] > 0) {
			return dp[N][K];
		}
		
		
		for(int i = 0; i <=N; i++) {
			
			dp[N][K] += solve(N-i,K-1,dp)%1000000000;
			dp[N][K] %=1000000000;
			
		}
		return dp[N][K];
	}
}
