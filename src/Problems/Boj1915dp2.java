package Problems;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * 
 * 백준 1915 가장 큰 정사각
 *
 */

public class Boj1915dp2 {

	public static int N, M, map[][], maxCnt = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer stk = new StringTokenizer(br.readLine());
		N = Integer.parseInt(stk.nextToken());
		M = Integer.parseInt(stk.nextToken());
		map = new int[N][M];
		for (int i = 0; i < N; i++) {
			String line = br.readLine();
			for (int j = 0; j < M; j++) {
				map[i][j] = line.charAt(j) - '0';
				if (map[i][j] == 0)
					continue;

				if (i - 1 >= 0 && j - 1 >= 0) {

					if (map[i - 1][j - 1] > 0 && map[i - 1][j] > 0 && map[i][j - 1] > 0) {

						 map[i][j] = Math.min(map[i - 1][j - 1], Math.min(map[i - 1][j], map[i][j - 1])) + 1;


					}

				}
        maxCnt = maxCnt < map[i][j] ? map[i][j] : maxCnt;


			}
		}


		System.out.println(maxCnt*maxCnt);

	}

	
}
