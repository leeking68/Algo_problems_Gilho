package Problems;

// no 83 1504 특정한최단경로 다익

import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Comparator;


public class Boj1504dij {

	static int n, e,p1,p2,INF = 999999;
	static int map[][];
	static int dist[];
	
	public static int dij(int start, int end) {
		
		PriorityQueue<Element> pq = new PriorityQueue<>(new Comparator<Element>() {
			
			public int compare(Element o1, Element o2) {
				return Integer.compare(o1.y, o2.y);
			}
		});
		dist[start] = 0;
		pq.offer(new Element(start, dist[start]));
		
		while(!pq.isEmpty()) {
			int nowNode = pq.peek().x;
			int weight = pq.poll().y;
			System.out.println(nowNode);
			
			for(int i = 2; i <=n; i++) {
				if(dist[i]>dist[nowNode]+map[nowNode][i])
					dist[i] = weight+map[nowNode][i];
					pq.offer(new Element(i,dist[i]));

			}
		}
		
		return dist[end];
	}

	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		
		n = in.nextInt();
		e = in.nextInt();
		
		map = new int[n+1][n+1];
		dist = new int[n+1];
		for(int i = 0; i <=n; i++ ) {
			dist[i] = INF;
			for(int j = 0; j <=n; j++) {
				map[i][j] = INF;
			}
		}
		
		for(int i = 0; i < e; i++) {
			int from = in.nextInt();
			int to = in.nextInt();
			int w = in.nextInt();
			
			map[from][to] = w;
		}
		
		p1 = in.nextInt();
		p2 = in.nextInt();
		
		
		in.close();
		
		int min1 = dij(1,p1) + dij(p1,p2) + dij(p2,n);
		System.out.println(dij(1,p1)+"," + dij(p1,p2)+"," + dij(p2,n)+","+min1);
		
		int min2 = dij(1,p2) + dij(p2,p1) + dij(p1,n);
		System.out.println(dij(1,p2)+"," + dij(p2,p1)+"," + dij(p1,n)+","+min2);
		int result = Math.min(min1, min2);
		
		System.out.println(result);
	}
}

class Element {
	int x, y; // x좌표, y좌표, 이동비용 ( 벽의 수 )

	public Element(int x, int y) {
		this.x = x;
		this.y = y;
	}
}