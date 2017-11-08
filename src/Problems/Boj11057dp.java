package Problems;

/**
 * 
 * 백준 11057 dp 
 *
 */
import java.util.Scanner;
public class Boj11057dp {
	public static int N;
	public static int mod = 10007;
	public static long d[][];
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		
		d = new long[N+1][10];
		for(int i = 0; i <= 9; i++) d[1][i] = 1;
		
		for(int i = 2; i <=N; i++) {
			for(int j = 0; j <=9; j++) {
				for(int k = 0; k <=j; k++) {
				d[i][j] += d[i-1][k];
				d[i][j]%=mod;
				}
			}
			
		}
		
		long ans = 0;
		for(int i = 0; i <= 9; i++) {
			ans += d[N][i];
		}
		
		ans %= mod;
		
		System.out.println(ans);
		
	}

}
