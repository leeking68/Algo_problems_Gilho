package Problems;
import java.util.Scanner;


public class Boj1535dp2 {

	public static int n,hp[],up[];
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private void solve() {
	    n = sc.nextInt();
	    int ans = 0;
	 
	    int[][] dp = new int[21][101];
	 
	    for (int i = 1; i <= n; i++) {
	        hp[i] = sc.nextInt();
	    }
	 
	    for (int i = 1; i <= n; i++) {
	        up[i] = sc.nextInt();
	    }
	 
	    dp[1][100 - hp[1]] = up[1];
	 
	    // dp[i][j] = i번째 사람까지 인사하고 남은 체력이 j일 때 최대 기쁨 
	 
	    for (int i = 2; i <= n; i++) {
	        dp[i][100 - hp[i]] = up[i];
	        for (int j = 100; j > 0; j--) {
	            if (j + hp[i] <= 100 && dp[i - 1][j + hp[i]] != 0) {
	                // max( dp[i - 1][(남은 체력) + (i번째 인사함으로써 소모되는 체력)], dp[i - 1][남은 체력] ) 
	                dp[i][j] = Math.max(dp[i - 1][j + hp[i]] + up[i], dp[i - 1][j]);
	            } else {
	                // 무조건 인사하는 것이 아닌, i번째 사람에게 인사를 안할 수도 있는 경우를 위함 
	                dp[i][j] = Math.max(dp[i][j], dp[i - 1][j]);
	            }
	        }
	    }
	 
	    for (int i = 100; i > 0; i--) {
	        ans = Math.max(dp[n][i], ans);
	    }
	    System.out.println(ans);
	}


}
