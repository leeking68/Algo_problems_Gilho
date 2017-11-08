package Problems;

/**
 * 
 * 백준 2*n 타일링 
 * 
 * 풀이 : 동적계획법 
 * 
 *
 */
import java.util.Scanner;
public class Boj11726dp {
	
	public static int n,dp[];
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		dp = new int[1001];
		dp[0] = 1;
		dp[1] = 1;
		
		for(int i = 2; i < n+1; i++) {
			
		dp[i] = dp[i-1] + dp[i-2];
	    dp[i] %= 10007;
			
		}
		
		System.out.println(dp[n]);
		
	
		
	}

}
