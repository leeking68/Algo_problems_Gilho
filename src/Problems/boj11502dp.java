package Problems;
//11502 붕어빵 dp

import java.util.Scanner;

public class boj11502dp {

	public static int n,d[],p[];
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		d = new int[n+1];
		p = new int[n+1];
		for(int i = 1; i <=n; i++) 
			p[i] = in.nextInt();
		d[0] = 0;
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=i; j++) {
				d[i] = Math.max(d[i], d[i-j]+p[j]);
			}
		}
		
		System.out.println(d[n]);
		in.close();
	}
}
