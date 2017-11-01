package Problems;

/**
 * 
 *   백준 2352 반도체 설계
 *   
 *   동적계획법, Lis
 *
 */

import java.util.Scanner;

public class Boj2352dpLis {

	public static int N, arr[], lis[], max = 0;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		N = in.nextInt();

		arr = new int[N + 1];
		lis = new int[N + 1];

		for (int i = 1; i < N + 1; i++) {

			arr[i] = in.nextInt();
			lis[i] = 1;
		}

		for (int i = 2; i < N + 1; i++) {

			for (int j = 1; i > j; j++) {	
				if (arr[j] < arr[i] && lis[i] < lis[j] + 1) {
					lis[i] = lis[j] + 1;
				}
			}
			
			if(max < lis[i]) {
				max = lis[i];
			}

		}
		
		System.out.println(max);

	}

}
