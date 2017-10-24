package Problems;

//백준 2032dp

import java.util.Scanner;

public class Boj2032dp {
	public static int n, m;
	public static int arr[], d[];

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		n = in.nextInt();
		m = in.nextInt();

		arr = new int[n + 1];
		d = new int[n + 1];

		for (int i = 0; i < n + 1; i++) {
			d[i] = 1;
			arr[i] = 1;
		}

		for (int i = 0; i < m; i++) {
			int vip = in.nextInt();
			arr[vip] = 0;
		}

		System.out.println(chair());

	}

	public static long chair() {

		d[0] = 1;
		d[1] = 1;
		long sum = 1;
		for (int i = 2; i < n + 1; i++) {
			if (arr[i] == 0) {
				sum *= d[i - 1];
				d[i] = 1;
				d[i - 1] = 0;
			} else {
				d[i] = d[i - 2] + d[i - 1];
			}
		}
		sum *= d[n];

		return sum;
	}
}
