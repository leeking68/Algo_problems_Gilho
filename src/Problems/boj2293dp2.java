package Problems;
/**
 * 
 * 백준 2239 동 
 * 
 * 동적계획
 * 
 *
 */
import java.util.Scanner;
public class boj2293dp2 {

	public static int n,k,coin[],dp[];
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		n = in.nextInt();
		k = in.nextInt();
		coin = new int[n+1];
		dp = new int[k+1];
		
		for(int i = 1; i <=n; i++) {
			coin[i] = in.nextInt();
		}
		
		dp[0] = 1;
		
		for(int i = 1; i <= n; i++) {
			for(int j = coin[i]; j <=k; j++) {
				dp[j] += dp[j-coin[i]];
				
			}
		}
		
		System.out.println(dp[k]);
	}

}
