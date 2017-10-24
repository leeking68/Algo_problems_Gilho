package Problems;

//백준 6359플로이드 

import java.util.Scanner;

public class Boj6359floyd {

	public static int n, k, map[][], flyod[][];

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		k = in.nextInt();
		map = new int[400][400];
		int from, to;
		for (int i = 0; i < k; i++) {
			from = in.nextInt();
			to = in.nextInt();
			map[from][to] = 1;
		}

		flyod();
		int s = in.nextInt();
		int checkI,checkJ;
		while(s-->0) {
			checkI = in.nextInt();
			checkJ = in.nextInt();
			if(map[checkI][checkJ]==1) {
				System.out.println("-1");
			} else if(map[checkJ][checkI]==1) {
				System.out.println("1");
			} else if(map[checkI][checkJ]==0) {
				System.out.println("0");
			}
		}
	}

	public static void flyod() {

		for (int k = 0; k <= n; k++) {
			for (int i = 0; i <= n; i++) {
				for (int j = 0; j <= n; j++) {
					if (map[i][j] == 0 && map[i][k] != 0 && map[k][j] != 0) {
						map[i][j] = 1;
					}
				}
			}
		}
	}

}
