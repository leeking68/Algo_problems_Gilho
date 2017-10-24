package Problems;

//백준 1600 bfs

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Boj1600bfsK {

	public static int dx[] = { 0, 0, -1, 1 }, dy[] = { -1, 1, 0, 0 }, dxH[] = { 1, 2, 2, 1, -1, -2, -2, -1 },
			dyH[] = { -2, -1, 1, 2, 2, 1, -1, -2 };
	public static int K, H, W;
	public static boolean map[][], visit[][][];

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		K = in.nextInt();
		W = in.nextInt();
		H = in.nextInt();
		visit = new boolean[H][W][K + 1];
		map = new boolean[H][W];

		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if (in.nextInt() == 1) {
					map[i][j] = true;
				}
			}
		}
		System.out.println(bfs());

	}

	public static int bfs() {
		Queue<Entry> q = new LinkedList<Entry>();
		q.offer(new Entry(0, 0, 0, 0));
		visit[0][0][0] = true;
		
		while(!q.isEmpty()) {
			Entry ent = q.poll();
			int x = ent.x;
			int y = ent.y;
			int cntHorse = ent.cntHorse;
			int nx,ny;
			if(x == H-1 && y == W-1) {
				return ent.cnt;
			}
			
			for(int i = 0; i < 4; i++) {
				nx = x + dx[i];
				ny = y + dy[i];
				if(isRange(nx,ny)&&!map[nx][ny]&&!visit[nx][ny][cntHorse]) {
					q.offer(new Entry(nx,ny,ent.cnt+1,cntHorse));
					visit[nx][ny][cntHorse] = true;
				}
			}
			
			if(cntHorse == K) {
				continue;
			}
			
			for(int i = 0; i < 8; i++) {
				nx = x + dxH[i];
				ny = x + dyH[i];
				if(isRange(nx,ny)&&!map[nx][ny]&&!visit[nx][ny][cntHorse+1]) {
					q.offer(new Entry(nx,ny,ent.cnt+1,cntHorse+1));
					visit[nx][ny][cntHorse+1] = true;
				}
			}
		}
		
		return -1;
	}

	public static boolean isRange(int x, int y) {
		return x < H && x >= 0 && y < W && y >= 0;
	}

	static class Entry {
		int x, y, cnt, cntHorse;

		public Entry(int x, int y, int cnt, int cntHorse) {
			this.x = x;
			this.y = y;
			this.cnt = cnt;
			this.cntHorse = cntHorse;
		}
	}

}
