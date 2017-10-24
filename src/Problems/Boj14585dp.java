package Problems;
//백준 14585 dp 
import java.util.Scanner;
public class Boj14585dp {

	public static int n,candy,dp[][],max=-1;
	public static boolean baguni[][];
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		candy = in.nextInt();
		baguni = new boolean[301][301];
		dp = new int[301][301];

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				dp[i][j] = 0;
			}
		}
		
		for(int i = 0; i < 3; i++) {
			int x = in.nextInt();
			int y = in.nextInt();
			baguni[x][y] = true;
		}
		
		candy();
		
		System.out.println(dp[300][300]);
		
	}
	
	public static void candy() {
		
		for(int i = 0; i < 301; i++) {
			for(int j = 0; j < 301; j++) {
				if(i==0&&j==0) {
					continue;
				}
				
				if(i==0) {
					if(baguni[i][j]) {
						dp[i][j] = dp[i][j-1] + (candy-i-j);
					} else {
						dp[i][j] = dp[i][j-1];
					}
					
				} else if(j==0) {
					if(baguni[i][j]) {
						dp[i][j] = dp[i-1][j] + (candy-i-j);
					} else {
						dp[i][j] = dp[i-1][j];
					}
					
				} else {
					if(baguni[i][j]) {
						dp[i][j] = (candy-i-j) + Math.max(dp[i-1][j], dp[i][j-1]);
					} else {
						dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
					}
					
				}
			}
		}
		
			
	}
}
