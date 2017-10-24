package Problems;

//2156 boj dp no88 

import java.util.Scanner;

public class Boj2156dp {

	static int n, wine[], sum[];

	public static int max(int a, int b, int c) {
		if (b > c) {
			if (a > b)
				return a;
			else
				return b;
		} else {
			if (a > c)
				return a;
			else
				return c;

		}

	}

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();

		wine = new int[n + 1];
		sum = new int[n + 1];

		for (int i = 0; i <= n; i++) {
			wine[i] = 0;
			sum[i] = 0;
		}

		for (int i = 1; i <= n; i++) {
			wine[i] = in.nextInt();
		}

		sum[0] = 0;
		sum[1] = wine[1] + sum[0];
		sum[2] = wine[2] + sum[1];

		for (int i = 3; i <= n; i++) {
			sum[i] = max(sum[i - 3] + wine[i - 1] + wine[i], sum[i - 1], sum[i - 2] + wine[i]);
		}
		System.out.println(sum[n]);
		in.close();

	}
}
