package Problems;

/**
 * 
 *	
 * 백준 2294 동전2
 * 
 * 동적계획
 *
 */
import java.util.Scanner;

public class boj2294dp2 {

	public static int n, k, arr[], d[];

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		k = in.nextInt();
		arr = new int[n + 1];
		d = new int[k + 1];

		for (int i = 1; i <= n; i++) {
			arr[i] = in.nextInt();
		}
		
		for(int i = 0; i <= k; i++) {
			d[i] = -1;
		}
		d[0] = 0;
		
		for(int i = 1; i <= n; i++) {
			for(int j = 0; j <= k; j++) {
				if(j-arr[i]>=0&&d[j-arr[i]]!=-1) {
					if(d[j]==-1||d[j]>d[j-arr[i]]+1) {
						d[j] = d[j-arr[i]]+1;
					}
				}
			}
		}
		
		System.out.println(d[k]);
	}
}
