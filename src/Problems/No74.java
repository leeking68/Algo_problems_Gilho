package Problems;

// 1922 no 74 네트워크 연결문제 백준

import java.util.Scanner;

public class No74 {

	public static int n, m, a, b, c, INF = 99999999, rs = 0;
	public static int[][] graph;
	public static int[] visit;
	public static String[] before;

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		n = in.nextInt();
		m = in.nextInt();

		graph = new int[n + 1][n + 1];
		visit = new int[n + 1];
		before = new String[n + 1];

		// 초기화

		for (int i = 0; i < n + 1; i++) {
			visit[i] = 0;
			before[i] = null;
			for (int j = 0; j < n + 1; j++) {
				graph[i][j] = 0;
			}
		}

		for (int i = 1; i < m + 1; i++) {
			a = in.nextInt();
			b = in.nextInt();
			c = in.nextInt();

			graph[a][b] = graph[b][a] = c;
		}
		
		visit[1] = -1; /// 시작
		
		prim(1);
	}

	public static void prim(int k) {
		int v = k;
		int next = 0;
		int num = 0;
		

		while (num < n) {
			System.out.println("num:"+num+"v:"+v);
			int min = INF;
			for (int j = 1; j < n+1; j++) {
				if (graph[v][j] != 0 && v != j && min > graph[v][j]&&visit[v]!=0) {
					min = graph[v][j];
					graph[v][j] = graph[j][v] = 0;
					next = j;
				}
			}
			System.out.println("");
			rs += min;
			visit[next]=v; 
			System.out.println(""+"min"+min+"nextNode :"+next + ", visit[v]"+visit[v]);
			v = next;
			num++;
		}
		
		System.out.println(rs);
	}
	

}
