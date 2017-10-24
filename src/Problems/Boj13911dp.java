package Problems;

import java.util.Arrays;
import java.util.Scanner;

public class Boj13911dp {

	public static int[][] map;
	public static int V, E, INF = 1000000000;
	public static int M, S, sum = 0;
	public static int Mcdo[], Star[];

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		V = in.nextInt();
		E = in.nextInt();
		map = new int[V + 1][V + 1];

		for(int i = 0; i <= V; i++) {
			for(int j = 0; j <= V; j++) {
				map[i][j] = INF;
			}
		}
		
		for (int i = 0; i < E; i++) {
			int u = in.nextInt();
			int v = in.nextInt();
			int w = in.nextInt();
			map[u][v] = map[v][u] = w;
		}

		int mnum = in.nextInt();
		M = in.nextInt();
		Mcdo = new int[V - 1];
		for (int i = 0; i < mnum; i++) {
			Mcdo[i] = in.nextInt();
		}

		int snum = in.nextInt();
		S = in.nextInt();
		Star = new int[V - 1];
		for (int i = 0; i < snum; i++) {
			Star[i] = in.nextInt();
		}

		floyd();

		for (int i = 1; i <= V; i++) {

			int mMax = 100000001;
			int sMax = 100000001;

			for (int j = 0; j < mnum; j++) {
				int mIndex = Mcdo[j];
				if (map[i][mIndex] > 0 && map[i][mIndex] <= M) {
					int checkM = map[i][mIndex];

					if (mMax > checkM) {
						mMax = checkM;
					}

				}

			}

			for (int k = 0; k < snum; k++) {
				int sIndex = Star[k];
				if (map[i][sIndex] > 0 && map[i][sIndex] <= S) {
					int checkS = map[i][sIndex];

					if (sMax > checkS) {
						sMax = checkS;
					}
				}

			}

			if (sum == 0 || sum > (sMax + mMax)) {
				sum = sMax + mMax;
			}

		}
		
		System.out.println(sum);

	}

	public static void floyd() {

		for (int k = 1; k <= V; k++) {
			for (int i = 1; i <= V; i++) {
				for (int j = 1; j <= V; j++) {
					map[i][j] = Math.min(map[i][j], map[i][k] + map[k][j]);
				}
			}
		}
	}

}
