package Problems;

// 1916 다익스트라 최소비용 구하기  이런식으로 하기 .
import java.util.Scanner;
import java.util.PriorityQueue;
public class boj1916dij {

	public static int n, d[], map[][];

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		int m = in.nextInt();
		d = new int[n+1];
		map = new int[n+1][n+1];
	
		for(int i = 0; i <=n; i++) {
			d[i] = 999999999;
			for(int j = 0; j<=n; j++) {
				map[i][j] = 99999999;
			}
		}
		
		for(int i = 0; i < m; i++) {
			int from = in.nextInt();
			int to = in.nextInt();
			
			map[from][to] = in.nextInt();
		}
		
		int start = in.nextInt();
		int end = in.nextInt();
		
		dij(start);
		System.out.println(d[end]);
		
		}
	
	public static void dij(int start) {
		PriorityQueue<Integer> pq = new PriorityQueue();
		
		map[start][start] = 0;
		d[start] = 0;
		
		pq.offer(start);
		
		while(!pq.isEmpty()) {
			int before = pq.poll();
			for(int i=1; i <=n; i++) {
				if(d[i] < map[before][i] + d[before]) {
					d[i] = map[before][i] = d[before];
					pq.offer(i);
				}
			}
		}
		
	}
}
