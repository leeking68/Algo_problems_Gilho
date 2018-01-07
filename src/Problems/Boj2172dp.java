package Problems;

/**
 * 
 * 
 *  백준 2172 동적계획법 
 *  
 *  동적 계획법 
 * 
 */
import java.util.Scanner;

public class Boj2172dp {

	public static int n, L, arr[][], d[][][][][];

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		n = in.nextInt();
		L = in.nextInt();

		arr = new int[20][20];
		d = new int[20][20][20][20][20];

		// 경로가 1인것들
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = in.nextInt();
				d[1][i][j][i][j] = 1;
			}
		}

		// 경로가 2인것들
		for (int x1 = 0; x1 < n; x1++) {
			for (int y1 = 0; y1 < n; y1++) {
				// 방향 탐색
				for (int x2 = x1 - 1; x2 <= x1 + 1; x2++) {
					for (int y2 = y1 - 1; y2 <= y1 + 1; y2++) {
						if (x2 >= 0 && x2 < n && y2 >= 0 && y2 < n) {
							if (!(x1 == x2 && y1 == y2)) {
								if (arr[x1][y1] == arr[x2][y2]) {
									d[2][x1][y1][x2][y2] = 1;
								}
							}
						}
					}
				}
			}
		}

		for (int l = 3; l <= L; l++) {
			for (int x1 = 0; x1 < n; x1++) {
				for (int y1 = 0; y1 < n; y1++) {
					for (int x2 = 0; x2 <= n; x2++) {
						for (int y2 = 0; y2 <= n; y2++) {
							if (arr[x1][y1] == arr[x2][y2]) {
								for (int x3 = x1 - 1; x3 <= x1 + 1; x3++) {
									for (int y3 = y1 - 1; y3 <= y1 + 1; y3++) {
										for (int x4 = x2 - 1; x4 <= x2 + 1; x4++) {
											for (int y4 = y2 - 1; y4 <= y2 + 1; y4++) {
												if (x3 >= 0 && x3 < n && y3 >= 0 && y3 < n) {
													if (x4 >= 0 && x4 < n && y4 >= 0 && y4 < n) {
														if (!(x1 == x3 && y1 == y3) && !(x2 == x4 && y2 == y4)) {
															d[l][x1][y1][x2][y2] += d[l - 2][x3][y3][x4][y4];
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}

		int ans = 0;
		for (int j = 0; j < n; j++) {
			for (int h = 0; h < n; h++) {
				for (int k = 0; k < n; k++) {
					for (int g = 0; g < n; g++) {
						ans += d[L][j][h][k][g];
					}
				}
			}
		}

		System.out.println(ans);

	}

}
