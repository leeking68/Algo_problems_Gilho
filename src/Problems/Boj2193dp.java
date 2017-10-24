package Problems;
//백준 2193 dp 이친수 

import java.util.Scanner;
public class Boj2193dp {
	
	public static int n;
	public static long d[];
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		d = new long[n];
		
		d[0] = 1;
		d[1] = 1;
		for(int i = 2; i <n; i++) {
			d[i] = d[i-1] + d[i-2];
		}
		
		System.out.println(d[n-1]);
		in.close();
	}
}
