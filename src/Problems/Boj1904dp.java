package Problems;
// 백준 1904 01타일 dp 

import java.util.Scanner;
public class Boj1904dp {

	public static int n,d[];
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt(); 
		d = new int[1000000];
		
		d[1] = 1; 
		d[2] = 2;
		
		for(int i = 3; i < n+1; i++) {
			d[i] = d[i-1] + d[i-2];
		}
		
		System.out.println(d[n]);
		
	}

}
