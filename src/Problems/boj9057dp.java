package Problems;

//boj 9507 Generations of Tribbles dp 

import java.util.Scanner;

public class boj9057dp {

	public static long d[];

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		d = new long[69];
		
		d[0] = 1; d[1] = 1;
		d[2] = 2; d[3] = 4;
		while(t-->0) {
			int num = in.nextInt();
			
			if(d[num]==0) {
				for(int i = 4; i<=num; i++) {
				d[num] = d[num-1] + d[num-2] + d[num-3] + d[num-4];
				}
			}
			
			System.out.println(d[num]);
			
		}
	}
}
