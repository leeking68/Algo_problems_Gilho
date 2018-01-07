package NewProblem;
/**
 * 
 * @author 2913 가스관 문제 
 * 
 * dfs 
 *
 */

import java.util.Scanner;
public class Bj2913dfs {

	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int R = in.nextInt();
		int c = in.nextInt();
		
		String[][] map = new String[R+1][c+1];
		
		for(int i = 1; i < R+1; i++) {
			for(int j = 1; j < c+1; j++) {
				map[i][j] = in.next();
			}
		}
		
		for(int i = 1; i < R+1; i++) {
			for(int j = 1; j < c+1; j++) {
				System.out.print(map[i][j]);
			}
				System.out.println("");
		}
	}

}
