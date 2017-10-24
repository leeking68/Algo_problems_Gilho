package Problems;

//����1049�� ��Ÿ�� ( �׸��� ) 

import java.util.Scanner;

public class No61 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int m = in.nextInt();
		int total = 1000000;
		int string = 0;
		int[] A = new int[m * 2];

		for (int i = 0; i < m * 2; i++) {
			A[i] = in.nextInt();
			System.out.println(A[i] + "��" + i);
		}

		for (int i = 0; i < m * 2; i++) {

			if ((i % 2) != 0) {
				string = A[i] * n;
			} else {
				string = (int) Math.abs((n / 6)+1) * A[i];
//				System.out.println("hole" + (int)Math.abs((n/6)+1)*A[i]);
			}
//			System.out.println("stirnggg" + string);
			if (total > string) {
				total = string;
			}

//			System.out.println("total" + total + "string" + string);

		}

		System.out.println(total);

		in.close();

	}

}
