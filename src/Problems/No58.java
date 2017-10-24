package Problems;
//�ּҺ� ���ϱ� 1916

import java.util.Scanner;

public class No58 {
	static final int INF = 100000001;

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int m = in.nextInt();
		int arr[][] = new int[n][n];
		boolean visited[] = new boolean[n+1];
		int start,end;
		
		for(int i = 0; i < n; i++) {
			
			visited[i] = false;
			
			for(int j = 0; j < n; j++) {
				arr[i][j] = INF;
				
			}
		}
		
		for(int i = 0; i < m; i++) {
			start = in.nextInt();
			end = in.nextInt();
			
			arr[start][end] = in.nextInt();
			
		}
		
		in.close();
	}

}
