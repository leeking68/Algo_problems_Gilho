package Problems;

// 백준 2668 dfs 

import java.util.Scanner;

public class Boj2668dfs2 {

	public static int N, arr[],cnt = 0;
	public static int visited[];

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		
		arr = new int[N + 1];
		visited = new int[N + 1];
		
		for (int i = 1; i < N + 1; i++) {
			arr[i] = in.nextInt();
		}
		
		for(int i = 1; i < N+1; i++) {
			dfs(i);
			init();
		}
		StringBuilder str = new StringBuilder("");
		for (int i = 1; i < N + 1; i++) {
			if(visited[i] == 2) {
				cnt++;
				str.append(i+"\n");
			}

		}
		
		str.insert(0, cnt+"\n");
		System.out.println(str.toString());


	}

	public static void dfs(int i) {
		if(visited[i]==2) return;
		visited[i]++;
		dfs(arr[i]);
		
	}
	
	public static void init() {
		for(int i = 1; i < N+1; i++) {
			if(visited[i]<2) {
				visited[i] = 0;
			}
		}
	}
}
