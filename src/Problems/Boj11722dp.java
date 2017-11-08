package Problems;

/**
 * 
 * 백준 11072 LIS
 * 
 * 
 */

import java.util.Scanner;

public class Boj11722dp {
	public static int n, arr[], d[], min = 0;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		n = in.nextInt();

		arr = new int[n];
		d = new int[n];

		for (int i = n-1; i >=0; i--) {
			arr[i] = in.nextInt();
		}

		for (int i = 0; i < n; i++) {
			d[i] = 1;

			for (int j = 0; j < i; j++) {
				if (arr[j] < arr[i] && d[i] < d[j] + 1) {

					d[i] = d[j] + 1;

				}
			}

			if (min < d[i]) {

				min = d[i];
			}

		}
		
		System.out.println(min);

	}

}
