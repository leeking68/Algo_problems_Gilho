package Problems;

// 백준 6359 dp 

import java.util.Scanner;

public class Boj6359dp {

	public static int t, n, arr[], cnt;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		t = in.nextInt();

		while (t-- > 0) {
			n = in.nextInt();
			arr = new int[101];
			cnt = n;
			cal();

		}
		

	}

	public static void cal() {
		for (int i = 2; i <= n; i++) {
			for (int j = 1; i * j <= n; j++) {
				if (arr[i * j] == 0) {
					arr[i * j] = 1;
					cnt--;
				} else if (arr[i*j] == 1) {
					arr[i*j] = 0;
					cnt++;
				}

			}
		}
		
		System.out.println(cnt);
	}

}
