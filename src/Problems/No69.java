package Problems;
import java.util.Scanner;

// dp , ���� 2579
 

public class No69 {

	public static int n, st[],dp[],max=-1;
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		st = new int[n+1];
		dp = new int[n+1];
		
		for(int i = 1; i <=n; i++) {
			st[i] = sc.nextInt();
		}
		
		dp[1] = st[1];
		dp[2] = st[1]+st[2];
		
		for(int i = 1; i <= n; i++) {
			dp[i] = Math.max(dp[i-3]+st[i-1]+st[i], dp[i-2]+st[i]);
		}
		
		System.out.println(dp[n]);
		
	}
	
}
