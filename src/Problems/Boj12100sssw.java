package Problems;

//백준 12100 2048
import java.util.Arrays;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj12100sssw {

	public static int left = 0;
	public static int up = 1;
	public static int right = 2;
	public static int down = 3;

	public static int n;
	public static int limit = 5;
	public static int blank = 0;
	public static int maxVal = 0;

	public static void main(String[] args) throws IOException {

		// input
		int[][] map = new int[21][21];

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {

			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {

				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		// solve
		dfs(map, 0);
		System.out.println(maxVal);
	}

	public static void dfs(int[][] map, int step) {

		if (step == limit) {
			findMax(map);
			return;
		}

		for (int i = 0; i < 4; i++) {
			int[][] mapCopy = new int[n][n];
			for (int j = 0; j < n; j++) {
				mapCopy = Arrays.copyOf(map, n);
			}
			dfs(action(mapCopy, i), step + 1);
		}
	}

	public static int[][] action(int mapCopy[][], int dir) {

		switch (dir) {
		case 0:

			for (int row = 0; row < n; row++) {

				int nblank = 0;
				// 왼쪽에서 오른쪽으로
				for (int col = 1; col < n; col++) {

					// 검사 노드 == 0
					if (mapCopy[row][col] == blank) {

						nblank++;
						continue;
					} else {

						// 병합 가능 : 검사 노드 = 대상 노드
						if (mapCopy[row][col] == mapCopy[row][col - 1 - nblank]) {

							mapCopy[row][col - 1 - nblank] *= 2;
							mapCopy[row][col] = blank;
						}
						// 병합 불가능 : 검사 노드 != 0 && 대상 노드 == 0
						else if (mapCopy[row][col - 1 - nblank] == 0) {

							mapCopy[row][col - 1 - nblank] = mapCopy[row][col];
							mapCopy[row][col] = blank;
							nblank++;
						}
						// 병합 불가능 : 검사 노드 != 0 && 대상 노드 != 0 && 검사노드 != 대상노드
						else {

							mapCopy[row][col - nblank] = mapCopy[row][col];
							if (nblank != 0)
								mapCopy[row][col] = blank;
						}
					}
				}
			}

			break;

		case 1:

			for (int col = 0; col < n; col++) {

				int nblank = 0;
				// 위쪽에서 아래쪽으로
				for (int row = 1; row < n; row++) {

					// 검사 노드 == 0
					if (mapCopy[row][col] == blank) {

						nblank++;
						continue;
					} else {

						// 병합 가능 : 검사 노드 = 대상 노드
						if (mapCopy[row - 1 - nblank][col] == mapCopy[row][col]) {

							mapCopy[row - 1 - nblank][col] *= 2;
							mapCopy[row][col] = blank;
						}
						// 병합 불가능 : 검사 노드 != 0 && 대상 노드 == 0
						else if (mapCopy[row - 1 - nblank][col] == 0) {

							mapCopy[row - 1 - nblank][col] = mapCopy[row][col];
							mapCopy[row][col] = blank;
							nblank++;
						}
						// 병합 불가능 : 검사 노드 != 0 && 대상 노드 == 0
						else {

							mapCopy[row - nblank][col] = mapCopy[row][col];
							if (nblank != 0)
								mapCopy[row][col] = blank;
						}
					}
				}
			}
			break;

		case 2:

			for (int row = 0; row < n; row++) {

				int nblank = 0;
				// 오른쪽에서 왼쪽으로
				for (int col = n - 2; col >= 0; col--) {

					// 검사 노드 == 0
					if (mapCopy[row][col] == blank) {

						nblank++;
						continue;
					} else {

						// 병합 가능 : 검사 노드 = 대상 노드
						if (mapCopy[row][col] == mapCopy[row][col + 1 + nblank]) {

							mapCopy[row][col + 1 + nblank] *= 2;
							mapCopy[row][col] = blank;
						}
						// 병합 불가능 : 검사 노드 != 0 && 대상 노드 == 0
						else if (mapCopy[row][col + 1 + nblank] == 0) {

							mapCopy[row][col + 1 + nblank] = mapCopy[row][col];
							mapCopy[row][col] = blank;
							nblank++;
						}
						// 병합 불가능 : 검사 노드 != 0 && 대상 노드 == 0
						else {

							mapCopy[row][col + nblank] = mapCopy[row][col];
							if (nblank != 0)
								mapCopy[row][col] = blank;
						}
					}
				}
			}
			break;

		case 3:

			for (int col = 0; col < n; col++) {

				int nblank = 0;
				// 아래쪽에서 위쪽으로
				for (int row = n - 2; row >= 0; row--) {

					// 검사 노드 == 0
					if (mapCopy[row][col] == blank) {

						nblank++;
						continue;
					} else {

						// 병합 가능 : 검사 노드 = 대상 노드
						if (mapCopy[row + 1 + nblank][col] == mapCopy[row][col]) {

							mapCopy[row + 1 + nblank][col] *= 2;
							mapCopy[row][col] = blank;
						}
						// 병합 불가능 : 검사 노드 != 0 && 대상 노드 == 0
						else if (mapCopy[row + 1 + nblank][col] == 0) {

							mapCopy[row + 1 + nblank][col] = mapCopy[row][col];
							mapCopy[row][col] = blank;
							nblank++;
						}
						// 병합 불가능 : 검사 노드 != 0 && 대상 노드 == 0
						else {

							mapCopy[row + nblank][col] = mapCopy[row][col];
							if (nblank != 0)
								mapCopy[row][col] = blank;
						}
					}
				}
			}
			break;
		}
		return mapCopy;

	}

	static void updateMaxValue(int[][] mapCopy) {

		int tempMaxValue = 0;

		for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {

		tempMaxValue = tempMaxValue < mapCopy[i][j] ? mapCopy[i][j] : tempMaxValue;
		}
		}

		maxVal = maxVal < tempMaxValue ? tempMaxValue : maxVal;
		}

}
