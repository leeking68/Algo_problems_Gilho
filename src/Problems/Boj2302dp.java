package Problems;
// no87 좌석배치 2302 dp 
import java.util.Scanner;
public class Boj2302dp {
	
	public static int n, d[];
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		
		n = in.nextInt();
		
		d = new int[n+1];
		int t = in.nextInt();
		int cnt = 0;
		int res = 1;
		dp(n);
		for(int k = 0; k < t; k++) {
			int x = in.nextInt();
			
			res*=d[x - cnt - 1];
			cnt = x;
		}
		res *= d[n-cnt];
		
		System.out.println(res);
	}
	
	// 피보나
	public static int dp(int n) {
		d[0]  = 1; d[1] =1;
		for(int i = 2; i <= n; i++) {
			d[i] = d[i-1] + d[i-2];
		}
		
		return d[n];
	}
}
