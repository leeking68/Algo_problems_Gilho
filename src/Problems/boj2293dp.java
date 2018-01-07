	package Problems;
	
	/**
	 * 
	 * 	백준 2293 동전 1 
	 *  
	 *  동적계획
	 *
	 */
	import java.util.Scanner;
	
	public class boj2293dp {
	
		public static int n, k, arr[], d[];
	
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			n = in.nextInt();
			k = in.nextInt();
	
			arr = new int[n + 1];
			d = new int[k + 1];
			for (int i = 1; i <= n; i++) {
				arr[i] = in.nextInt();
			}
			
			d[0] = 1;
			for(int i = 1; i <= n; i++) {
				for(int j = 0; j <= k; j++) {
					if(j-arr[i]>=0) {
						d[j] += d[j-arr[i]];
					}
					
				}
			}
			
			System.out.println(d[k]);
		}
	
	}
