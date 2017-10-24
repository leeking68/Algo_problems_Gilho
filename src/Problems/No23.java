package Problems;

//�ذ��̹��� ���ڰŲٷ� 

import java.util.Scanner;

public class No23 {

	public void reverse(int a[], int n) {
		int b = n % 2;
		int temp = 0;

		if (b == 0) {
			int k = n / 2 - 1;

			for (int h = 0; h < k; h++) {
				temp = a[h];
				a[h] = a[n - h];
				a[n - h] = temp;

				System.out.println("�k :" + temp + a[h] + a[n - h]);

				System.out.print("" + a[h]);
			}

		} else {
			int k = n / 2;

			for (int h = 0; h < k - 1; h++) {
				temp = a[h];
				a[h] = a[n - h];
				a[n - h] = temp;

				System.out.print("" + a[h]);
			}

		}

	}

	public static void main(String args[]) {
		No23 no = new No23();

		Scanner in = new Scanner(System.in);

		System.out.println("�Է��� ���� ������ �Է��Ͻÿ� : ");

		int n = in.nextInt();

		int a[] = new int[n];

		for (int m = 0; m < n; m++) {
			System.out.println("���ڸ� �Է��Ͻÿ� : ");
			a[m] = in.nextInt();
		}

		no.reverse(a, n);

	}
}
