package Problems;

//백준 1309동물원 dp 두번째

import java.util.Scanner;
public class Boj1309dp2 {

	public static int N,dp[][];
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		dp = new int[100001][3];
		
		dp[0][1] = dp[0][2] = dp[0][0] = 1;
		
		for(int i = 1; i < N; i++) {
			
			dp[i][0] = (dp[i-1][1] + dp[i-1][2] + dp[i-1][0])%9901;
			dp[i][1] = dp[i-1][0] + dp[i-1][2];
			dp[i][2] = dp[i-1][0] + dp[i-1][1];
			
		}
		
		System.out.println((dp[N-1][0]+dp[N-1][1]+dp[N-1][2])%9901);
		
	}

}
