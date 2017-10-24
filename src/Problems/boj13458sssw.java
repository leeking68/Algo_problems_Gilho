package Problems;

//백준 13458 삼성 문제 감독관

import java.util.Scanner;

public class boj13458sssw {

	public static int N, A[], B, C;
	public static long dirCnt = 0;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = in.nextInt();
		}
		B = in.nextInt();
		C = in.nextInt();
		mainCal();

		System.out.println (dirCnt);

	}

	public static void mainCal() {
		int div = 0;
		int mod = 0;

		for (int i = 0; i < N; i++) {
			A[i] -= B;
			dirCnt++;

			if (A[i] >= C) {
				div = A[i] / C;
				mod = A[i] % C;

				if (mod != 0) {
					dirCnt += (div + 1);
				} else {
					dirCnt += div;
				}

			} else if (0 < A[i] && A[i] < C) {
				dirCnt += 1;
			} else if (A[i] < 0) {
				continue;
			}

		}

	}

}
