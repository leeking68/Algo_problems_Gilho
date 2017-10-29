package Problems;

/**
 * 
 *
 * 백준 1140 경로 찾기 
 * 
 * flyod
 *
 */

import java.util.Scanner;

public class Boj11403floyd2 {

	public static int N, map[][];

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();

		map = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				map[i][j] = in.nextInt();

			}
		}
		
		floyd();

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(map[i][j]);
				System.out.println();
			}	
		}

	}

	public static void floyd() {

		for (int k = 0; k < N; k++) {
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (map[i][j] == 0) {
						if ((map[i][k] + map[k][j]) == 2) {
							map[i][j] = 1;
						}
					}
				}
			}
		}

	}

}
