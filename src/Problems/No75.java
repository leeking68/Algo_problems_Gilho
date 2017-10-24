package Problems;

//1495 백준 기리스트 dp

import java.util.Scanner;

public class No75 {

	static int N, S, M;
	static int vol[];
	static int dp[][];
	
	public static void cal(int k) {
		int chVol = vol[k], before = k -1;
		for(int i = 0; i <=M; i++){
			if(dp[before][i]==1)
				if(i-chVol>=0) {
					dp[k][i-chVol]=1;
				}
				if(i+chVol<=M){
					dp[k][i+chVol]=1;
				}
		}
	}
	
	public static int findMAX() {
		
		int max = -1;
		
		for(int i=0; i < N; i++) {
			for(int j = 0; j <=M; j++)
				if(dp[i][j]==1&&max<j){
					max = j;
				}
		}
		
		if(max != -1)
			return max;
		
		return 0;
	}

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		 N = in.nextInt();
		 S = in.nextInt();
		 M = in.nextInt();
		vol = new int[N];
		dp = new int[N][M + 1];
		for (int i = 0; i < N; i++)
			vol[i] = in.nextInt();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M + 1; j++) {
				dp[i][j] = 0;
			}
		}
		
		in.close();
		
		if(S - vol[0]>=0)
			dp[0][S-vol[0]] = 1;
		if(S + vol[0]<=10)
			dp[0][S+vol[0]] = 1;
		
		for(int k = 1; k < N; k++) {
			cal(k);
		}
		
		
		int result = findMAX();
		
		System.out.println(result);
	}
}
