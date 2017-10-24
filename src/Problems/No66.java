package Problems;

//1753�� �ִܰ�� ���ͽ�Ʈ�� 
import java.util.Scanner;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.ArrayList;;

public class No66 {

	public static int v, e, start, dist[];
	public static final int inf = Integer.MAX_VALUE;
	public static ArrayList<ArrayList<Graph>> graph = new ArrayList<>();
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		v = sc.nextInt(); 
		e = sc.nextInt();
		
		dist = new int[v+1];
		Arrays.fill(dist, inf);
		
		for(int i=0; i<=v; i++)
			graph.add(new ArrayList());
		
		for(int i=1; i<=e; i++) {
			
			int from = sc.nextInt();
			int to = sc.nextInt();
			int w = sc.nextInt();
			
			graph.get(from).add(new Graph(to,w));
		}
		
		dijkstra(start);
		
		for(int i = 1; i <= v; i++) {
			System.out.println("aa"+dist[i]);
		}
		
		for(int i=1; i<=v; i++) {
			if(dist[i]==inf) {
				System.out.println("INF");
			}
			else System.out.println(dist[i]);
		}
	}
	
	public static void dijkstra(int start) {
		PriorityQueue<Graph> pq = new PriorityQueue<>();
		dist[start] = 0;
		pq.add(new Graph(start, dist[start]));
		
		while(!pq.isEmpty()) {
			int now_v = pq.peek().v;
			int now_w = pq.peek().w;
			System.out.println(now_v+";"+now_w);
			pq.poll();
			
			for(Graph g : graph.get(now_v)) {
				int next_v = g.v;
				int next_w = g.w;
				System.out.println(next_v+"[]"+next_w);
				
				if(dist[next_v] > dist[now_v] + next_w) {
					dist[next_v] = dist[now_v] + next_w;
					pq.add(new Graph(next_v, dist[next_v]));
				}
			}
			
		}
	}
	
	static class Graph implements Comparable<Graph> {
		int v, w;
		Graph(int v, int w) {
			this.v = v;
			this.w = w;
		}
		
		@Override
		public int compareTo(Graph o) {
			return (this.w>o.w) ? 1:-1; // ���� �� ������ 1���Ͽ� �켱 ���� ������, �켱���� ť��� 
		}
	}

}


