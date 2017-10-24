package Problems;

//백준 1699dp

import java.util.Scanner;

public class Boj1699dp {

	public static int k, dp[], ans = 100001;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		k = in.nextInt();
		dp = new int[k + 1];
		for (int i = 1; i < 100000; i++) {
			if (k< i * i) {
				break;
			}

			cal(i, k);
			if (ans > dp[k]) {
				ans = dp[k];
			}

			dp[k] = 0;

		}

		System.out.println(ans);

	}

	public static void cal(int num, int n) {
		int divNum = 0;
		int modNum = 0;
		int div = num * num;
		divNum = n / div;
		dp[k] += divNum;
		modNum = n % div;

		if (divNum == 0) {
			return;
		}

		if (modNum == 0) {
			return;
		} else if (modNum != 0) {
			cal(divNum, modNum);
		}
	}

}
