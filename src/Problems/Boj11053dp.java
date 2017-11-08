package Problems;

/**
 * 
 * 백준 11053 LIS
 * 
 * 
 */

import java.util.Scanner;

public class Boj11053dp {
	public static int n, arr[], d[], max = 0;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		n = in.nextInt();

		arr = new int[n];
		d = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}

		for (int i = 0; i < n; i++) {
			d[i] = 1;

			for (int j = 0; j < i; j++) {
				if (arr[j] < arr[i] && d[i] < d[j] + 1) {

					d[i] = d[j] + 1;

				}
			}

			if (max < d[i]) {

				max = d[i];
			}

		}
		
		System.out.println(max);

	}

}
