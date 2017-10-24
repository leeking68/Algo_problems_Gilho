package Problems;
import java.util.Scanner;

//25/23

public class No25 {

	public void check(int n) {

		for (int i = 1; i <= n; i++) {
			if ((i % 2) == 0) {

				int total = 0;

				for (int j = 1; j <= i / 2; j++) {

					int d = 0;

					d = i % j;

					if (d == 0) {
						total += j;
					}

				}

				if (i == total) {
					System.out.print("������"+i);
				}

			}

		}

	}

	public static void main(String agrs[]) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		No25 no = new No25();

		no.check(n);

	}
}
