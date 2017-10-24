package Problems;

// 백준 치즈 boj 2638 

import java.util.Scanner;

public class Boj2638dfs {

	public static int n, m, map[][];
	public static int CHEESE = 1;
	public static int READY = 0;
	public static int OUT = 2;
	public static boolean visit[][];

	public static int dx[] = { -1, 1, 0, 0 };
	public static int dy[] = { 0, 0, -1, 1 };

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();

		map = new int[101][101];
		visit = new boolean[101][101];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				map[i][j] = in.nextInt();
			}
		}

		int step = 0;
		boolean check = false;

		while (!check) {
			
			step++;

			init();
			dfs(0, 0);
			
			int cnt = 0;
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < m; j++) {
					if(map[i][j]==CHEESE&&!visit[i][j]) {
						checkCh(i,j);
						
						cnt++;
					}
				}
			}
			
			if(cnt == 0) {
				check = true;
				System.out.println(step);
			}
			
		}

	}

	public static void init() {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				visit[i][j] = false;
			}
		}

	}

	public static void dfs(int x, int y) {

		map[x][y] = OUT;
		visit[x][y] = true;
		
		for(int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(!isRange(nx,ny)) continue;
			if(map[nx][ny]==CHEESE) continue;
			if(visit[nx][ny]) continue;
			
			dfs(nx,ny);
			
		}

	}

	public static boolean isRange(int x, int y) {
		return x < n && x >= 0 && y < m && y >= 0;

	}

	public static boolean checkCh(int x, int y) {
		
		int cnt = 0;
		
		for(int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(isRange(nx,ny)&&map[nx][ny]==OUT) {
				cnt++;
			}
		}
		
		if(cnt >=2) {
			map[x][y] = READY;
			return true;
		}
		
		return false;

	}

}
