package Problems;
//boj9251 lcs dp 1 

import java.io.BufferedWriter;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.OutputStreamWriter;

public class Boj9251lcsdp1 {

	public static int leng1,leng2,dp[][];
	public static String[] x = new String[2];
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		x[0] = in.readLine();
		x[1] = in.readLine();
		leng1 = x[0].length();
		leng2 = x[1].length();
		dp = new int[leng1+1][leng2+1];
		
		lcs();
		out.write(dp[leng1][leng2]);
		out.close();
		in.close();
		
	}
	public static void lcs() {
		for(int i = 1; i <= leng1; i++) {
			for(int j = 1; j<= leng2; j++) {
				if(x[0].charAt(i-1)==x[1].charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1] + 1;
				} else {
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
	}
}

