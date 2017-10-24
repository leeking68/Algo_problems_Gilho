package Problems;
// no 84 5557 1학년 DP

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Boj5557Dp2 {
	
	public static int n, arr[];
	public static long d[][];
	
	public static void main(String args[]) throws Exception {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		n = Integer.parseInt(in.readLine());
		arr = new int[n];
		d = new long[n][21];
		
		String line[] = in.readLine().split(" ");
		for(int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(line[i]);
		
		out.write(calc()+"");
		out.close();
		in.close();
	}
	
	private static long calc() {
		int i, j, num;
		
		d[0][arr[0]] = 1;
		
		for(i=1; i<n-1; i++) {
			for(j=0; j<=20; j++) {
				if(d[i-1][j]>0){
					num = j + arr[i];
					if(isInRange(num))
						d[i][num] += d[i-1][j];
					
					num = j - arr[i];
					if(isInRange(num))
						d[i][num] += d[i-1][j];
					
				}
			}
		}
		return d[n-2][arr[n-1]];
	}
	
	private static boolean isInRange(int n){
		return 0<=n&&n<=20;
	}
}	
