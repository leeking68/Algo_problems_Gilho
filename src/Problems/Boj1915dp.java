package Problems;

//백준 1915 가장 큰 정사각형 

import java.util.Scanner;

public class Boj1915dp {
	
	public static int n,m,d[][],s[][],cnt = 0;
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();
		s = new int[n+1][m+1];
		d = new int[n+1][m+1];
		String[] str = new String[n+1];
		for(int i = 1; i < n+1; i++) {
			str[i] = in.next();
			for(int j = 1; j < m+1; j++) {
				s[i][j] = Integer.parseInt(str[i].substring(j-1,j));
			}
		}
		findSqu();
		
		System.out.println(cnt*cnt);
	}
	
	public static void findSqu() {
		for(int i = 1; i < n+1; i++) {
			for(int j = 1; j < m+1; j++) {
				if(s[i][j]==1) {
					d[i][j] = Math.min(Math.min(d[i-1][j], d[i][j-1]), d[i-1][j-1])+1;
					if(cnt < d[i][j]) {
						cnt = d[i][j];
					}
				}
			}
		}
	}

}
