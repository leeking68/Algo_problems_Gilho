package Problems;

// no 86 경로찾기 플로이드 

import java.util.Scanner;

public class boj11403floyd {

	public static int n,INF=100, map[][];

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		n = in.nextInt();

		map = new int[n+1][n+1];


		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=n; j++) {
				map[i][j] = in.nextInt();
				if(map[i][j]==0)
					map[i][j] = INF;
			}
		}

		floyd();

		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=n; j++) {
				System.out.printf("%d", map[i][j] == INF ? 0 : 1 );
				
			}
			System.out.println("\n");
		}

	}

	public static void floyd() {

		for (int k = 1; k <=n; k++) {
			for (int i = 1; i <=n; i++) {
				for (int j = 1; j <=n; j++) {
					if(map[i][j]>map[i][k]+map[k][j]) {
						map[i][j] = map[i][k]+map[k][j];
					}
				}
			}
		}

	}

}
