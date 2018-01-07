package StudyGroup;

/**
 * 
 * 171216 시험 문제 
 * 
 * 동적계획
 *
 */
import java.util.Scanner;

public class boj2240dp171217Bottomup {

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
		
		for(int i = 0; i <= t; i++) {
			for(int j = 0; j<=w; j++) {
				if(arr[j]==arr[i]) {
					
				}
			}
		}
		int ans = 0;
		
		System.out.println(ans);
		

	}
	
		
		
	

}
