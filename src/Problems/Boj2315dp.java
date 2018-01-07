package Problems;
import java.util.Arrays;
/**
 * 
 * 백준 2315 가로등끄기 
 * 
 *  동적계획
 * 
 *
 */
import java.util.Scanner;
public class Boj2315dp {
	
	public static int n,m;
	public static int a[] = new int[1001];
	public static int w[] = new int[1001];
	public static int s[] = new int[1001];
	public static int d[][][] = new int[1001][1001][2];
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		m= in.nextInt();
		
		for(int i = 1; i <= n; i++) {
			a[i] = in.nextInt();
			w[i] = in.nextInt();
			s[i] = s[i-1] + w[i];
		}
		
		for(int i = 0; i < 1001; i++) {
			for(int j = 0; j < 1001;j++) {
				for (int w = 0; w <2; w++) {
					d[i][j][w] = -1;
					
				}
			}
		}
		
		System.out.println(solution(m,m,0));
		
	}
	
	public static int solution(int left, int right, int where) {
		
			if(left == 1 && right == n) {
				return 0;
			}
		
		if(d[left][right][where] != -1) {
			return d[left][right][where];
		}
		
		int ans = 214748364;
		
		int now = where == 0 ? left : right;
		System.out.println("now  :  " + now);
		if(left - 1 >= 1) {
			ans = Math.min(ans, solution(left-1,right,0) + (a[now]-a[left-1])*(s[n]-s[right]+s[left-1]));
		} 
		
		if(right + 1 <=n) {
			ans = Math.min(ans, solution(left,right+1,1) + (a[right+1]-a[now])*(s[n]-s[right]+s[left-1]));
			
		}
		
		d[left][right][where] = ans;
		
		return ans;
	
	
	}

}
