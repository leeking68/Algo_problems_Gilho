package Problems;

//백준 11053 LIS 
import java.util.Arrays;
import java.util.Scanner;

public class Boj11053Lis {

	public static int N, a[], d[], cnt = 0;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		a = new int[N];
		d = new int[N];
		
		for(int i = 0; i < N; i++) {
			a[i] = in.nextInt();
		}
		Arrays.fill(d, 1);

		for (int i = 1; i < N; i++) {
			for (int j = 0; j < i; j++) {
				if (a[j] < a[i] && d[i] < d[j] + 1) {
					d[i] = d[j] + 1;
					if (cnt < d[i]) {
						cnt = d[i];
					}
				}

			}
		}
		
		System.out.println(cnt);

	}

}
