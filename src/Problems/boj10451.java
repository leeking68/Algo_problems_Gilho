package Problems;

// 10451 , no77 사이클 구하기

import java.util.Scanner;

public class boj10451 {

	static int N, start, cnt;
	static int[][] map;
	static boolean[] visit;

	public static void dfs(int now) {
		visit[now] = true;
		if (now == start) {
			cnt++;
			return;
		} else {
			for (int j = 1; j < N + 1; j++) {
				if (!visit[j] && map[now][j] == 1) {
					dfs(j);
				}
			}
		}
	}

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		N = in.nextInt();
		map = new int[N + 1][N + 1];
		visit = new boolean[N + 1];
		cnt = 0;

		for (int i = 0; i < N + 1; i++) {
			visit[i] = false;
			for (int j = 0; j < N + 1; j++) {
				map[i][j] = 0;
			}
		}

		for (int i = 1; i < N + 1; i++) {
			int a = in.nextInt();
			map[i][a] = 1;
		}
		
		for(int i = 1; i < N+1; i++){
			for(int j = 1; j < N+1; j++) {
				if(map[i][j]==1){
				}
			}
		}

		for (int i = 1; i < N + 1; i++) {
			start = i;
			for (int j = 1; j < N + 1; j++) {
				if (!visit[i] && map[i][j] == 1) {
					dfs(j);
				}
			}
		}
		
		System.out.println(cnt);
	}

}
