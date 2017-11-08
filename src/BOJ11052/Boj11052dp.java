package Problems;

/**
 * 
 *
 *  백준 11052 붕어빵 판매하기
 *  
 *
 */
import java.util.Scanner;

public class Boj11052dp {

	public static int N, arr[], dp[], max = -1;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();

		arr = new int[1001];
		dp = new int[1001];

		for(int i = 1; i < N+1; i++) {
			arr[i]  = in.nextInt();
		}
		
		for (int i = 1; i < N + 1; i++) {
			for (int j = 1; j < i+1; j++) {
				dp[i] = Math.max(dp[i], arr[j] + dp[i - j]);
			}
		}
		
		System.out.println(dp[N]);

	}

}
