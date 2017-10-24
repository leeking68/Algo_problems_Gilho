package Problems;
// 백준 9465 ㅇdp 

import java.util.Scanner;

public class Boj9465dp {
	
	public static int n,d[][],a[][];
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		
		d = new int[2][n+1];
		a = new int[2][n+1];
		
		for(int i = 0; i <2; i++) {
			for(int j = 1; j<=n; j++) {
				a[i][j] = in.nextInt();
			}
		}
		
		d[0][0] = d[1][0] = 0;
		d[0][1] = a[0][1];
		d[1][1] = a[1][1];
		
		for(int i = 2; i<=n; i++) {
			d[0][i] = Math.max(d[1][i-1], d[1][i-2]) + a[0][i];
			d[1][i] = Math.max(d[0][i-1], d[0][i-2]) + a[1][i];
		}
		
		int max = Math.max(d[0][n], d[1][n]);
		
		System.out.println(max);
		
		
		
		
		
	}
	
}
