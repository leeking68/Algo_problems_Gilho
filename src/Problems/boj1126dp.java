package Problems;

import java.util.Arrays;
/**
 * 
 * 백준 1126 같은 
 * 
 * 동적계획법 
 * 
 */
import java.util.Scanner;

public class boj1126dp {

	public static int n, arr[],dp[][],index=0;
	public static int inf = 1000000000;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		arr = new int[50];
		dp = new int[50][250001];
		
		for(int i = 0; i < 50; i++) {
			for(int j = 0; j < 250001; j++) {
				dp[i][j] = -1;
			}
		}
		
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		
		System.out.println(solution(0,0));
	}

	public static int solution(int k, int diff) {
		
		if (diff > 250000) {
			return -inf;
		}

		if (k == n) {
			if (diff == 0) {
				return 0; // 다뽑았는데 높이가 맞
			} else {
				return -inf; // 다뽑았지만, 높이가 맞지 않는다.
			}
		}
		
		int ans = dp[k][diff];
		
		if(ans != -1) {
			return ans;
		}
		
		ans = solution(k+1,diff);
		ans = Math.max(ans,solution(k+1,diff+arr[k]));
		
		if(arr[k]>diff) {
			
			ans =Math.max(ans, diff+solution(k+1,arr[k]-diff));
			
		} else {
			
			ans = Math.max(ans, arr[k]+solution(k+1,diff-arr[k]));
		}
		
		return ans;

	}
}
