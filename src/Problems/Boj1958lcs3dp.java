package Problems;
import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Boj1958lcs3dp {

	public static int leng1, leng2,leng3, dp[][][];
	public static String[] x = new String[3];

	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		x[0] = in.readLine();
		x[1] = in.readLine();
		x[2] = in.readLine();
		leng1 = x[0].length();
		leng2 = x[1].length();
		leng3 = x[2].length();
		dp = new int[leng1 + 1][leng2 + 1][leng3+1];

		lcs();

		out.write(dp[leng1][leng2][leng3]);
		out.close();
		in.close();

	}

	public static void lcs() {
		for (int i = 1; i <= leng1; i++) {
			for (int j = 1; j <= leng2; j++) { 
				for(int k = 1; k <=leng3; k++){
				
				if (x[0].charAt(i - 1) == x[1].charAt(j - 1)&&x[0].charAt(i-1) == x[2].charAt(k-1)) {
					dp[i][j][k] = dp[i - 1][j - 1][k-1] + 1;
				} else {
					dp[i][j][k] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
			}
		}
		}
	}
}
