package Problems;
// 미로탐색 재풀이 2178dp
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
public class Boj2178dpdp {

	public static int n,m,map[][];
	public static int[] dx = {-1,1,0,0};
	public static int[] dy = {0,0,-1,1};
	public static boolean visited[][];

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		n = in.nextInt();
		m = in.nextInt();
		map = new int[n][m];
		
		for(int i = 0; i<n; i++) 
			for(int j = 0; j<n; j++) {
				map[i][j] = in.nextInt();
				visited[i][j] = false;
			}
				
				dij(0,0);
				
				System.out.println(map[n-1][m-1]);
		
	}
	
	public static void dij(int a,int b){
		Queue<Node>  q = new LinkedList();
		q.add(new Node(a,b));
		while(!q.isEmpty()) {
			Node node = q.poll();
			visited[node.x][node.y] = true;
			for(int i = 0; i < 4; i++) {
				int nx = node.x + dx[i];
				int ny = node.y + dy[i];
				
				if(nx<n&&nx>=0&&ny<n&&ny>=0&&visited[nx][ny]==false&&map[nx][ny]==1) {
					q.add(new Node(nx,ny));
					map[nx][ny] = map[node.x][node.y] + 1;
					
				}
			}
			
		}
		
		
	}

	
	
}
	


