package Problems;
// no90 boj1932숫자삼각형 dp 

import java.util.Scanner;

public class Boj1932dpdp {
	
	public static int n,map[][];
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		n = in.nextInt();
		map = new int[n+1][n+1];
		int max = 0;
		for (int i =1; i <=n; i++) {
			for (int j = 1; j <= i; j++) {
				map[i][j] = in.nextInt();
			
				if(j==1)
					map[i][j] = map[i-1][j] + map[i][j];
				else if (j==i) 
					map[i][j] = map[i-1][j-1] + map[i][j];
				else 
					map[i][j] = Math.max(map[i-1][j-1], map[i-1][j]) + map[i][j];
				if(max<map[i][j])
					max = map[i][j];
			}
		}
		
		System.out.println(max);
	}
	
}
