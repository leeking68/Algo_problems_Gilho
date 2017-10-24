package Problems;

//no 85 boj 1392 케빈베이컨의 법칙 6단계 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Boj1392floyd {

	public static int n, m, INF = 999999, map[][];

	public static void main(String arg[]) {
		// BufferedReader in = new BufferedReader(new
		// InputStreamReader(System.in));
		// BufferedWriter out = new BufferedWriter(new
		// OutputStreamWriter(System.out));
		Scanner in = new Scanner(System.in);

		n = in.nextInt();
		m = in.nextInt();

		map = new int[n + 1][n + 1];

		init();

		for (int i = 0; i < m; i++) {
			int from = in.nextInt();
			int to = in.nextInt();
			map[from][to] = map[to][from] = 1;
		}

		floyd();

		int sum = 0;
		int min = 999999;
		int who = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				sum += map[i][j];
			}

			if (min > sum) {
				min = sum;
				who = i;
			}

			sum = 0;
		}

		System.out.println(who);

	}

	public static void init() {
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				if (i == j) {
					map[i][j] = 0;
				} else {
					map[i][j] = INF;
				}
			}
		}
	}

	public static void floyd() {
		for (int k = 1; k <= n; k++) {
			for (int i = 0; i <= n; i++) {
				for (int j = 0; j <= n; j++) {
					if (map[i][k] != 0 && map[k][i] != 0 && i != j) {
						if (map[i][j] == 0) {
							map[i][j] = map[i][k] + map[k][j];
						} else {
							map[i][j] = Math.min(map[i][j], map[i][k] + map[k][j]);
						}
					}
				}
			}
		}
	}
}
