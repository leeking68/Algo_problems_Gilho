package Problems;

/**
 * 
 *
 * 백준 10844 쉬운계단수 
 *
 */
import java.util.Scanner;
public class Boj10844dp {

	public static int N;
	public static long mod = 1000000000L;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		long[][] dp = new long[N+1][10];
		
		for(int i = 1; i <10; i++) dp[1][i] = 1;
		
		
		for(int i = 2; i < N+1; i++) {
			for(int j = 0; j < 10; j++) {
				
				dp[i][j] = 0;
				
				if(j+1<=9) dp[i][j] += dp[i-1][j+1];
				
				if(j-1>=0) dp[i][j] += dp[i-1][j-1];
				
				dp[i][j]%=mod;
				
			}
		}
		
	    long ans = 0; 
		
		for(int i = 0; i <=9; i++) {
			ans += dp[N][i];
		}
		
		System.out.println(ans%mod);
	}

}
