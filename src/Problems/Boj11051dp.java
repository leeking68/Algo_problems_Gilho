package Problems;
/**
 * 
 * 백준 11051 이항계수 2 
 * 
 *  동적계획
 *
 */


import java.util.Scanner;
public class Boj11051dp {

	public static int n,k,dp[][]= new int[1001][1001];
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		k = in.nextInt();
		
		System.out.println(solution(n,k));
		
	}
	
	public static int solution(int n, int k) {
		
		if(n==k||k==0) return 1;
		
		if(dp[n][k]>0) return dp[n][k];
		
		
		dp[n][k] = solution(n-1,k-1) + solution(n-1,k);
		
		return dp[n][k]%10007;
	}
	


}
