package Problems;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Comparator;
public class kakaocodeMain1 {

	public static int[] dx = {0,0,-1,1};
	public static int[] dy = {-1,1,0,0};
	public static int cnt;
	public static void main(String arg[]) {
		int[][] timemap = {{0, 2, 99}, {100, 100, 4}, {1, 2, 0}};
		int n = 3;
		int m = 3;
		int s = 150;
		
		solution(3,3,150,timemap);
		System.out.println(cnt+","+timemap[n-1][m-1]);
	}
	
	public static void solution(int n, int m, int s, int[][] timemap ) {
		int[][] dist = new int[n][m];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				dist[i][j] = 9999999;
			}
		}
		int min = 999999999;
		cnt = 1;
		
		PriorityQueue<Node> pq = new PriorityQueue<>();		
		pq.offer(new Node(0,0));
		dist[0][0] = 0;
		while(!pq.isEmpty()) {
			Node next = pq.poll();
			
			for(int i = 0; i < 4; i++) {
				int nx = next.x + dx[i];
				int ny = next.y = dy[i];
				
				if(isRange(nx,ny,n,m)&&dist[nx][ny] > dist[next.x][next.y]+timemap[next.x][next.y]
						&&timemap[next.x][next.y]!=(-1)&&dist[next.x][next.y]+timemap[next.x][next.y]<s){
					System.out.println("-1");
					dist[nx][ny] = dist[next.x][next.y]+timemap[next.x][next.y];
					System.out.println("dist["+nx+"]["+ny+"]");
					System.out.println("ㄴㄴ :" + dist[nx][ny]);
					pq.offer(new Node(nx,ny));
					
					if(min > dist[nx][ny]){
						min = dist[nx][ny];
						cnt = 1;
					}
					cnt++;
				}
				
			}
			
		}
	}
	
	public static boolean isRange(int x, int y,int n,int m) {
		return (x < n && x >= 0) && (y < m && y >= 0);
	}
	
	
	
}
class Node {
	int x, y; // x좌표, y좌표, 이동비용 ( 벽의 수 )

	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
