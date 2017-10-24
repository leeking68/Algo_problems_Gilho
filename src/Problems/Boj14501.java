package Problems;

// 백준 14501 퇴사 dp 

import java.util.Scanner;

public class Boj14501 {

	public static int n, t[], p[], max = -1, d[];

	// d 는 동적계획법 전용 배열
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		t = new int[n + 1];
		p = new int[n + 1];
		d = new int[n + 1];

		for (int i = 1; i < n + 1; i++) {
			t[i] = in.nextInt();
			p[i] = in.nextInt();
			d[i] = p[i];
		}

		dp2();

		System.out.println(max);

	}

//	public static void dp() {
//		for (int i = 1; i < n; i++) {
//
//			int next = t[i] + i;
//			if (next <= 7) {
//				d[next] = Math.max(d[next], p[next] + d[i]);
//			}
//
//		}
//
//		for (int i = 1; i < n; i++) {
//
//			if (max < d[i]) {
//				max = d[i];
//			}
//
//		}
//	}
	
	public static void dp2() {
		for (int i = 2; i <= n; i++) {

			for (int j = 1; j < i; j++) {

				if (i - j >= t[j]) {
					d[i] = Math.max(p[i] + d[j], d[i]);
				}

			}

		}


		for (int i = 1; i <= n; i++) {
			if (i + t[i] <= n + 1) {
				if (max < d[i]) {
					max = d[i];
				}
			}
		}
	}
}
