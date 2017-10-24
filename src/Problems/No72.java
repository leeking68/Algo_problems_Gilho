package Problems;

// 백준 기본dfs,bfs

import java.util.Scanner;
import java.util.Queue;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.io.FileInputStream;
import java.util.LinkedList;

public class No72 {

	public static int n, m, v;
	public static int[][] graph;
	public static boolean[] visited;

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		n = in.nextInt();
		m = in.nextInt();
		v = in.nextInt();

		graph = new int[n + 1][n + 1];
		visited = new boolean[n + 1];

		for (int i = 1; i < n + 1; i++) {
			visited[i] = false;
		}

		for (int i = 1; i < m + 1; i++) {
			int v1 = in.nextInt();
			int v2 = in.nextInt();

			graph[v1][v2] = graph[v2][v1] = 1;
		}
		
		in.close();
		
		dfs(v);
		
		for(int i = 0; i < n+1; i++) {
			visited[i] = false;
		}
		
		bfs(v);
	}
	
	public static void dfs(int i) {
		visited[i] = true;
		System.out.println(i+"");
		
		for(int j = 1; j < n+1; j++) {
			if(graph[i][j]==1&&visited[j]==false) 
				dfs(j);
		}
	}
	
	public static void bfs(int i) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(i);
		visited[i] =true;
		System.out.println(i+"");
		
		int temp;
		
		while(!q.isEmpty()) {
			temp = q.poll();
			
			for(int j = 1; j < n+1; j++) {
				if(graph[temp][j]==1&&visited[j]==false) {
					q.add(j);
					visited[j] = true;
					System.out.println(j+"");
				}
			}
		}
		
	}
}
