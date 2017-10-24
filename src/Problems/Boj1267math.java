package Problems;

// boj 1267 핸드폰 요금제 , 수학 no 89

import java.util.Scanner;

public class Boj1267math {

	static int n, arr[];

	public static void main(String arg[]) {
		Scanner in = new Scanner(System.in);

		n = in.nextInt();
		arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		in.close();
		int y = ySic(arr);
		int m = mSic(arr);
		int yPrice = y * 10;
		int mPrice = m * 15;

		if (yPrice == mPrice)
			System.out.print("Y ");
		System.out.printf("%c %d", yPrice < mPrice ? 'Y' : 'M', yPrice < mPrice ? yPrice : mPrice);
	}

	public static int ySic(int arr[]) {
		int cnt = 0;
		int mod = 0;

		for (int i = 0; i < arr.length; i++) {
			cnt += arr[i] / 30;
			mod = arr[i] % 30;

			if (mod != 0) {
				cnt += 1;
			}
		}

		return cnt;

	}

	public static int mSic(int arr[]) {
		int cnt = 0;
		int mod = 0;

		for (int i = 0; i < arr.length; i++) {
			cnt += arr[i] / 60;
			mod = arr[i] % 60;

			if (mod != 0) {
				cnt += 1;
			}
		}

		return cnt;

	}
}
