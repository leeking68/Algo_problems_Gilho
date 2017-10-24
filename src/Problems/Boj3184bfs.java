package Problems;
//백준 3184 bfs 

import java.util.Scanner;
import java.awt.Point;
import java.util.LinkedList;
import java.util.Queue;

public class Boj3184bfs {

	public static int n, m,sheepNum,wolfNum,totalSheep=0,totalWolf=0;
	public static char[][] map;
	public static Scanner in = new Scanner(System.in);
	public static int dx[] = {-1,1,0,0}, dy[] = {0,0,-1,1};

	public static void main(String[] args) {
		String line = in.nextLine();
		n = Integer.parseInt(line.substring(0, line.indexOf(" ")));
		m = Integer.parseInt(line.substring(line.indexOf(" ")+1));

		map = new char[n][m];

		init();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(map[i][j]!='#'){
					dij(i,j);
					checkNum();
				}
			}
		}
		
		System.out.println(totalSheep + " " + totalWolf);

	}

	public static void init() {
		for (int i = 0; i < n; i++) {
			String line = in.nextLine();
			for (int j = 0; j < m; j++) {
				map[i][j] = line.charAt(j);
			}
		}
	}
	
	public static void checkNum() { 
		if(sheepNum > wolfNum) totalSheep += sheepNum;
		else totalWolf += wolfNum;
		
		sheepNum = wolfNum=0;
	}
	
	public static void dij(int a, int b) {
		Queue<Point> q = new LinkedList<>();
		q.offer(new Point(a,b));
		if(map[a][b]=='o') sheepNum++;
		else if(map[a][b]=='v') wolfNum++;
		map[a][b] = '#';
		int x,y;
		while(!q.isEmpty()) {
			x = q.peek().x; y = q.poll().y;
			for(int i = 0 ; i < 4 ; i++) {
				int nx = x + dx[i]; int ny = y + dy[i];
				if(isRange(nx,ny)&&map[nx][ny]!='#') {
					if(map[nx][ny]=='o') sheepNum++;
					else if(map[nx][ny]=='v') wolfNum++;
					map[nx][ny] = '#';
					q.offer(new Point(nx,ny));
				}
			}
			
			
		}
	}
	
	public static boolean isRange(int x, int y) {
		return (0<=x&&x<n&&0<=y&&y<m);
	}

}
