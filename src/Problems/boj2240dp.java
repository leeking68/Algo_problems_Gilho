package Problems;

/**
 * 
 * 백준 2240 자두나무 
 * 
 *  동적 계획법 
 *
 */
import java.util.Scanner;

public class boj2240dp {

	public static int n, m, arr[], d[][];

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();
		arr = new int[n + 1];
		d = new int[n + 1][m + 1];
		for (int i = 1; i <= n; i++) {
			arr[i] = in.nextInt();
		}

		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= m; j++) {
				d[i][j] = -1;
			}
		}
		int max = Math.max(findJado(arr,d,n,m,0,0), findJado(arr,d,n,m,0,1));
		
		System.out.println(max);
	}

	public static int findJado(int[] arr, int[][] d, int n, int m, int sec, int turn) {

		if (sec == n + 1 && turn <= m)
			return 0;
		if (turn > m)
			return 0;

		// 자두의 개수가 0이 될수도
		if (d[sec][turn] != -1) {
			return d[sec][turn];
		}

		int where = turn % 2 + 1;
		
		d[sec][turn] = Math.max(findJado(arr,d,n,m,sec+1,turn), findJado(arr,d,n,m,sec+1,turn+1)) + (where == arr[sec] ? 1:0);
		return d[sec][turn];
	}
}
