package Problems;

/**
 * 
 * 
 *	백준 5557 1학년
 *  
 * 	동적 계획
 *
 */
import java.util.Scanner;

public class Boj5557dp3 {

	public static int n;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		int[] numbers = new int[n];

		for (int i = 0; i < n; i++) {
			numbers[i] = in.nextInt();
		}


		int[][] dp = new int[100][21];
		dp[0][numbers[0]] = 1;
		for (int i = 1; i < n-1; i++) {
			for (int j = 0; j < 21; j++) {

				if (dp[i - 1][j] > 0) {

					if (j - numbers[i] >= 0 && j + numbers[i] < 21) {
						dp[i][j + numbers[i]] += dp[i - 1][j];
						dp[i][j - numbers[i]] += dp[i - 1][j];
						
						if(i==n-2) {
							if(j+numbers[i] == 8) {
								System.out.println("11");
							}
							if(j-numbers[i]==8 ) {
								System.out.println("!!!");
							}
						}
					}

//					if (j + numbers[i] < 21) {
	//						dp[i][j + numbers[i]] += dp[i - 1][j];
//					}
				}
			}

		}

		System.out.println(dp[n - 2][numbers[n-1]]);
	}

}
