package Problems;

// 백준 1613 graph 

import java.util.Scanner;

public class Boj1613graph {

	public static int n, k, map[][], floyd[][];

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		k = in.nextInt();
		map = new int[n + 1][n + 1];
		floyd = new int[n + 1][n + 1];
		for (int i = 0; i < k; i++) {
			int x = in.nextInt();
			int y = in.nextInt();
			map[x][y] = 1;
		}
		
		graphFlyod();

		int s = in.nextInt();

		for (int i = 0; i < s; i++) {
			int checkX = in.nextInt();
			int checkY = in.nextInt();
			
			if(map[checkX][checkY] > 0) {
				System.out.println("-1");
			} else if(map[checkY][checkX] > 0&&map[checkX][checkY]==0) {
				System.out.println("1");
			} else if(map[checkX][checkY]==0) {
				System.out.println("0");
			}
		}

	}

	public static void graphFlyod() {
		
		for(int k = 0; k < n+1; k++) {
			for(int i = 0; i < n+1; i++) {
				for(int j = 0; j < n+1; j++) {
					if(map[i][j]==1||map[i][k]+map[k][j]==2) {
						map[i][j] = 1;
					}
				}
			}
		}
		
	}

}
