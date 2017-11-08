package Problems;
/**
 * 
 *
 *  백준 1890 점프
 *  
 *  동적 계획
 *
 */
import java.util.Scanner;
public class Boj1890dp2 {
	public static int n;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n =in.nextInt();
		int[][] arr = new int[n][n];
		int[][] d = new int[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		
	
		System.out.println(dp(arr,d));
		
	}
	
	public static int dp(int[][] arr, int[][] d) {
		d[0][0] = 1;
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j< n; j++) {
				
				if(i==0&&j==0) continue;
				
				for(int k = 0; k < j; k++) {
					System.out.println("j : " + j +  "     k :  "  +  k  + "      arr[k][j] : " + arr[k][j]);

					if(j == k+arr[k][j]) {
						d[i][j] += d[k][j];
						
					}
				}
				
				for(int k = 0; k <i; k++) {
					if(i == k+arr[i][k]) {
						
						d[i][j] += d[i][k];
						
					}
				}
				
				
			}
		}
		
		return d[n-1][n-1];
		
		
	}

}
