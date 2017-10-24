package Problems;

// 백준 14501 2017삼성 상반기 
import java.util.Arrays;
import java.util.Scanner;

public class bij14501sssw {

	public static int n, T[], P[], d[], INF = 1000000;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		T = new int[16];
		P = new int[16];
		d = new int[16];

		Arrays.fill(d, -1);

		for (int i = 1; i < n + 1; i++) {
			T[i] = in.nextInt();
			P[i] = in.nextInt();
		}

		System.out.println(dp(1));
		System.out.println(Arrays.toString(d));

	}

	public static int dp(int index) {

		if (index == n + 1) {
			return 0;
		}

		if (index > n + 1) {
			return -INF;
		}

		if (d[index] != -1) {
			return d[index];
		}

		return d[index] = Math.max(dp(index + 1), dp(index + T[index]) + P[index]);
	}

}
