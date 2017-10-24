package Problems;
// 백준 9252 lcs dp

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
public class Boj9252lcsdp {
	
	public static int leng1,leng2,d[][];
	public static String[] x = new String[2];
	public static String[][] lcs;
	public static String y[];
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		x[0] = in.readLine();
		x[1] = in.readLine();
		leng1 = x[0].length();
		leng2 = x[1].length();
		d = new int[leng1+1][leng2+1];
		lcs = new String[leng1+1][leng2+1];
		
		for(int i = 0; i<=leng1; i++) {
			for(int j = 0; j<=leng2; j++) {
				lcs[i][j] = "";
			}
		}
		
		calLcs();
		out.write(d[leng1][leng2]+"\n"+lcs[leng1][leng2]);
		out.close();
		in.close();
	}
	
	public static void calLcs() {
		
		for(int i = 0; i<=leng1; i++) 
			d[i][0] = 0;
		for(int j = 0; j<=leng2; j++)
			d[0][j] = 0;
		for(int i=1; i<=leng1; i++) {
			for(int j = 1; j<=leng2; j++) {
				if(x[0].charAt(i-1)==x[1].charAt(j-1)){
					d[i][j] = d[i-1][j-1] +1;
					lcs[i][j] += lcs[i-1][j-1] + x[0].charAt(i-1);
				} else {
					d[i][j] = Math.max(d[i-1][j], d[i][j-1]);
					if(lcs[i-1][j].length() > lcs[i][j-1].length()) lcs[i][j] = lcs[i-1][j];
					else 
						lcs[i][j] = lcs[i][j-1];
				}
			}
		}
	}
}
