package Problems;
// 백준 1309 동물원dp

import java.util.Scanner;

public class Boj1309dp {
	
	public static int n,d[];
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		d= new int[n+1];
		d[0] = 1; d[1] = 3;
		for(int i = 2; i <= n; i++) {
			d[i] = d[i-2] + d[i-1]*2;
			d[i]%=9901;
		} 
		
		System.out.println(d[n]%9901);
		
		in.close();
		
	}
}
