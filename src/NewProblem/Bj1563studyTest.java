package NewProblem;
/**
 *
 *  1월 7일 문제 
 *  
 *  개근상 
 *
 */

import java.util.Scanner;

public class Bj1563studyTest {

	public static int mod = 1000000;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		int d[][][][][] = new int[n + 1][3][3][3][2];

		for (int now = 0; now < 3; now++) {
			for (int yester = 0; yester < 3; yester++) {
				for (int yester2 = 0; yester2 < 3; yester2++) {

					// 결석3번 체크
					if (now == 2 && yester == 2 && yester2 == 2) {
						continue;
					}

					// 지각 2번 체크
					if ((now == 1 && yester == 1) || (now == 1 && yester2 == 1) || (yester == 1 && yester2 == 2)) {
						continue;
					}

					// 나머지는 지각 했고 안했고로 나눌 수 있다.
					if (now == 1 || yester == 1 || yester2 == 1) {
						d[3][now][yester][yester2][1] = 1;
					} else {
						d[3][now][yester][yester2][0] = 1;
					}

				}
			}
		}

		for (int i = 4; i < n + 1; i++) {
			for (int yester = 0; yester < 3; yester++) {
				for (int yester2 = 0; yester2 < 3; yester2++) {
					for (int yester3 = 0; yester3 < 3; yester3++) {

						// 출석
						d[i][0][yester][yester2][0] += d[i - 1][yester][yester2][yester3][0];
						d[i][0][yester][yester2][0] %= mod;
						d[i][0][yester][yester2][1] += d[i - 1][yester][yester2][yester3][1];
						d[i][0][yester][yester2][1] %= mod;

						// 지각

						d[i][1][yester][yester2][1] += d[i - 1][yester][yester2][yester3][0];
						d[i][1][yester][yester2][1] %= mod;

						// 결석
						if (yester == 2 && yester2 == 2) {

						} else {

							d[i][2][yester][yester2][0] += d[i - 1][yester][yester2][yester3][0];
							d[i][2][yester][yester2][0] %= mod;
							d[i][2][yester][yester2][1] += d[i - 1][yester][yester2][yester3][1];
							d[i][2][yester][yester2][1] %= mod;
						}
					}
				}
			}
		}
		
		int ans = 0;
		
		for (int now = 0; now < 3; now++) {
			for (int yester = 0; yester < 3; yester++) {
				for (int yester2 = 0; yester2 < 3; yester2++) {
					for (int late = 0; late < 2; late++) {
						ans += d[n][now][yester][yester2][late];
						ans %= mod;
					}
				}
			}
		}

		System.out.println(ans);

	}

}
