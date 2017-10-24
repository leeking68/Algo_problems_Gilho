package Problems;

import java.util.Scanner;

public class midas06 {

	public static int n, apple[], d[];

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		apple = new int[n + 1];
		d = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			apple[i] = in.nextInt();
		}

		System.out.println(d[n]);
		in.close();

	}

	public static void dp() {
		d[0] = 0;

		for (int i = 1; i <= n; i++) {
			d[i] = 0;
			for (int j = 1; j <= i; j++) {
				d[i] = Math.max(d[i], d[i - j] + apple[j]);
			}
		}
	}

}
