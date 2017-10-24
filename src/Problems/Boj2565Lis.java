package Problems;

//백준 2565 LIS 
import java.util.Arrays;
import java.util.Scanner;

public class Boj2565Lis {

	public static int N, a[], d[], cnt = 0, roof = 0;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		a = new int[500];
		d = new int[500];

		for (int i = 0; i < N; i++) {
			int b = in.nextInt();
			int c = in.nextInt();
			a[b] = c;
			if (roof < b) {
				roof = b;
			}
		}
		for (int i = 0; i < N + 1; i++) {
			System.out.println("i :" + i + "    값 :" + a[i] + " max num  :" + roof);
		}
		Arrays.fill(d, 1);

		for (int i = 2; i < roof + 1; i++) {
			for (int j = 1; j < i; j++) {
				if (a[j] < a[i] && d[i] < d[j] + 1) {
					d[i] = d[j] + 1;
					System.out.println("i  :"+i+"   j    :" + j);
					if (cnt < d[i]) {
						System.out.println(i+ "   <- i" +  "    d[ i ]  :" + d[i]);
						cnt = d[i];
						Arrays.b					}
				}

			}
		}

		System.out.println(N-cnt);

	}

}
