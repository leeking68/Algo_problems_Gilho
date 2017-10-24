package Problems;
import java.util.Scanner;

public class No64 {

	private static int[][] arr;
	private static int[][] result;
	private static int comp;

	public static int dfs(int n, int length) {
		for (int j = 0; j < length; j++) {
			if (arr[n][j] == 1) {
				if (j == comp) {
					System.out.println(n + "��" + j);
					return 1;
				}
				dfs(j, length);
			}
		}

		return 0;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int N = in.nextInt();

		arr = new int[N][N];
		result = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				arr[i][j] = in.nextInt();
				result[i][j] = 0;
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (arr[i][j] == 1) {
					result[i][j] = 1;
				} else {
					comp = j;
					int a = dfs(i, N);
					result[i][j] = a;
				}
			}
		}

		for(int i = 0; i < N; i ++) {
			for(int j = 0; j < N; j++ ) {
				System.out.print(result[i][j]+"");
			}
			System.out.println();
		}

	}

}
