package Problems;
/**
 * 
 * 백준 9461 파도반 수열 
 * 
 * 동적계획법 
 * 
 */
import java.util.Scanner;

public class Boj9461dp2 {
	public static int t,n;
	public static long[] dp;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		t = in.nextInt();
		
		for(int test_case = 0; test_case < t; test_case++) {
			
			n = in.nextInt();
			
			dp = new long[n];
			
			dp[0] = 1;
			dp[1] = 1;
			dp[2] = 1;
			dp[3] = 2;
			dp[4] = 2;
			
			for(int i = 5; i < n; i++) {
				
				dp[i]  = dp[i-1] + dp[i-5];
				
			}
			
			System.out.println(dp[n-1]);
		}
	}

}
