package Problems;
/**
 * 
 * 백준 2168 2차원 배열의 합 
 * 
 * 
 *
 */

import java.util.Scanner;

public class Boj2167dp2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[][] arr = new int[n + 1][m + 1];

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		
		int test_case = in.nextInt();
		StringBuilder sb = new StringBuilder("");
		for(int t = 0; t < test_case; t++) {
			int x1 = in.nextInt();
			int y1 = in.nextInt();
			int x2 = in.nextInt();
			int y2 = in.nextInt();
			
			int sum = 0;
			
			for(int i = x1; i <=x2; i++) {
				for(int j = y1; j<=y2; j++) {
					sum += arr[i][j];
				}
			}
			
			sb.append(sum);
			sb.append("\n");
			
		}
		System.out.println(sb);

	}

}
