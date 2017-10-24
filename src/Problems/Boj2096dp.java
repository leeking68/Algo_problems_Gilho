package Problems;

// 백준 2096 내려가기 dp

import java.util.Scanner;

public class Boj2096dp {

	public static int n, a[][], d[][];

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();

		a = new int[n + 1][3];
		d = new int[n + 1][3];

		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = in.nextInt();
			}
		}

		d[0][0] = d[0][1] = d[0][2] = 0;

		for (int i = 1; i <= n; i++) {
			d[i][0] = Math.max(d[i - 1][0], d[i - 1][1]) + a[i][0];
			d[i][1] = Math.max(Math.max(d[i - 1][0], d[i - 1][1]), d[i - 1][2]) + a[i][1];
			d[i][2] = Math.max(d[i - 1][1], d[i - 1][2]) + a[i][2];
		}

		int maxNum = max(max(d[n][1], d[n][0]), d[n][2]);

		for (int i = 1; i <= n; i++) {
			d[i][0] = Math.min(d[i - 1][0], d[i - 1][1]) + a[i][0];
			d[i][1] = Math.min(Math.min(d[i - 1][0], d[i - 1][1]), d[i - 1][2]) + a[i][1];
			d[i][2] = Math.min(d[i - 1][1], d[i - 1][2]) + a[i][2];
		}

		int minNum = min(min(d[n][1], d[n][0]), d[n][2]);

		System.out.println(maxNum + " " + minNum);

		in.close();
	}

	public static int max(int a, int b) {
		return (a > b ? a : b);
	}

	public static int min(int a, int b) {
		return (a < b ? a : b);
	}

}
