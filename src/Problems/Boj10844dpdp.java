package Problems;
//Boj 10844dpdp  쉬운계단수 

import java.util.Scanner;
public class Boj10844dpdp {
	
	public static int n;
	public static long d[];
	public static long mod = 1000000000;
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		d = new long[n+1];
		
		System.out.println(dp(n,d));
	}
	
	public static long dp(int n, long d[]) {
		
		d[1] = 9;
		
		for(int i = 2; i <=n; i++) {
			d[i] = (d[i-1]*2 - (i-1))%mod;
		}
		
		return d[n];
	}
}
