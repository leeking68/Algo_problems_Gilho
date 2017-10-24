package Problems;

// no 88 10164 격자상의 경로 디피 

import java.util.Scanner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Boj10164dp {

	public static int n, m, k, kx, ky,map[][];

	public static void dp() {
		map = new int[n + 1][m + 1];
		map[0][1] = 1;
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < m; j++) {
				map[i][j] = map[i - 1][j] + map[i][j - 1];
			}
		}

	}

	public static int result() {
		if (k == 0) return map[n][m];
		int ax = k / m + (k % m > 0 ? 1 : 0);
		int ay = k - (ax - 1) * m;
		int bx = n - ax + 1;
		int by = m - ay + 1;
		return map[ax][ay] * map[bx][by];
	}

	public static void main(String args[]) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		String line[] = in.readLine().split(" ");
		n = Integer.parseInt(line[0]);
		m = Integer.parseInt(line[1]);
		k = Integer.parseInt(line[2]);
		
		
	
		dp();
		out.write(result());
		in.close();
		out.close();

	}
}
