package Problems;
// boj 10005 위상정렬

import java.util.Scanner;
public class Boj1005graph {
	public static int n,k;
	public static int graph[][];
	public static int arr[];
	
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		k = in.nextInt();
		
		arr = new int[n+1];
		
		for(int k = 1; k<n+1; k++) {
			arr[k] = in.nextInt();
		}
		System.out.println(arr[1]+"iiiiii");
		graph = new int[n+1][n+1];
		
		for(int i = 0; i < k; i++) {
			int from = in.nextInt();
			int to = in.nextInt();
			graph[from][to] = 1;
		}
		
		int goal = in.nextInt();
		
		dp();
		
		System.out.println(arr[goal]);
		
	}
	
	public static void dp() {
		for(int j = 1; j < n+1; j++) {
			int max = 0;
			int temp = 0;
			int i = 0;
			for( i = 1; i < n+1; i++) {
				
				if(graph[i][j]==1&&max<arr[i]+arr[j]) {
					max = arr[i] + arr[j];
					System.out.println("arr[j]"+arr[j]+"arr[i]" + arr[i] );
					System.out.println("from : " + (i) +" to"+j +"max :"+ max);
					temp = 1;
				}
				
			}
			if(temp!=0) {
				arr[j] = max;

			}
			System.out.println( " weight : "+ max + " arr[j-1] "+ arr[j]);

		}
	}
}
