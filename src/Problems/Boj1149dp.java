package Problems;
// 백준 1149 dp

import java.util.Scanner;
public class Boj1149dp {
	
	public static int n,d[][],map[][];
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		d = new int[n+1][3];
		map = new int[n+1][3];
		
		for(int i = 1; i <=n; i++) {
			for(int j = 0; j<3; j++) {
				map[i][j] = in.nextInt();
			}
		}
		
		d[0][0] = d[0][1] = d[0][2] = map[0][0] = map[0][1] = map[0][2] = 0;
		
		for(int i = 1; i <=n; i++) {
			d[i][0] = Math.min(d[i-1][1], d[i-1][2]) + map[i][0];
			d[i][1] = Math.min(d[i-1][0], d[i-1][2]) + map[i][1];
			d[i][2] = Math.min(d[i-1][0], d[i-1][1]) + map[i][2];
		}
		int min = Math.min(Math.min(d[n][0], d[n][1]),d[n][2]);
		System.out.println(min);
		
		
	}
}
