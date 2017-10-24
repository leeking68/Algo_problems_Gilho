package Problems;
import java.util.Scanner;
public class Boj1507flyod {

	public static int n,dist[][],graph[][],ans=0;
	public static boolean check[][];
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		dist = new int[n+1][n+1];
		check = new boolean[n+1][n+1];
		graph = new int[n+1][n+1];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				dist[i][j] = in.nextInt();
				graph[i][j] = dist[i][j];
			}
		}
		
		reFloyd();
	}
	
	public static void reFloyd() {
		for(int i = 1; i < n+1; i++) {
			for(int k = 1; k < n+1; k++) {
				for(int j = 1; j < n+1; j++) {
					
					if(i==k || k == j) {
						continue;
					}
					
					if(dist[i][j] > dist[i][k]+dist[k][j]) {
						System.out.println("-1");
					}
					
					if(dist[i][j] == dist[i][k] + dist[k][j]) {
						graph[i][j] = 0;
					}
					
					
					
				}
			}
		}
		
		for(int i = 1; i < n+1; i ++) {
			for(int j = 1; j < n+1; j++) {
				if(graph[i][j]!=0&&!check[i][j]) {
					ans += graph[i][j];
					check[i][j] = true;
					check[j][i] = true;
				}
				
				
			}
		}
		
		System.out.println(ans);
	}
}
