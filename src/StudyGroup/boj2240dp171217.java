package StudyGroup;

/**
 * 
 * 171216 시험 문제 

 * 
 * 동적계획
 *
 */
import java.util.Scanner;

public class boj2240dp171217 {

	public static int[] arr;
	public static int[][] d;
	public static int t, w;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		t = in.nextInt();
		w = in.nextInt();
		arr = new int[t + 1];
		d = new int[t + 1][w + 1];

		for (int i = 1; i <= t; i++) {
			arr[i] = in.nextInt();
		}

		for (int i = 0; i <= t; i++) {
			for (int j = 0; j <= w; j++) {
				d[i][j] = -1;
			}
		}
		int ans = 0;
		
		ans = Math.max(solve(0,0), solve(0,1));
		
		
		System.out.println(ans);
		

	}
	
	public static int solve(int sec, int turn) {
		if(sec == t+1 && turn <= w) { 
			return 0 ;
		}

		
		if(turn > w) {
			return 0;
		}

		if(d[sec][turn] != -1) {
			return d[sec][turn];
		}
		
		int where = turn%2 + 1;
		
		d[sec][turn] = Math.max(solve(sec+1,turn), solve(sec+1,turn+1)) + (where == arr[sec] ? 1:0);
		
		return d[sec][turn];
		
		
	}
	

}
