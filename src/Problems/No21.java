package Problems;

//18�� �̺а˻� �˰��� ���� 10815��
import java.util.Scanner;

public class No21 {

	// m�� ���� Ƚ��
	public void check(int n, int m, int a[], int b[]) {

		for (int k = 0; k < m; k++) {
			
			q:
			for (int h = 0; h < n; h++) {
				if (b[k] == a[h]) {
					System.out.print(" 1 ");
					k++;
					h=0;
					continue q;
					
				}

			}

			System.out.print(" 0 ");

		}

	}

	public static void main(String args[]) {

		No21 no = new No21();

		Scanner in = new Scanner(System.in);

		System.out.println("���� ������ ������ �Է��Ͻÿ�.");
		int n = in.nextInt();

		int a[] = new int[n];

		for (int j = 0; j < n; j++) {
			System.out.println("���� ���ڵ��� �Է��Ͻÿ�.");
			a[j] = in.nextInt();
		}

		System.out.println("������ �� ���ڰ���  �Է��Ͻÿ�.");
		int m = in.nextInt();

		int b[] = new int[m];

		for (int i = 0; i < m; i++) {
			System.out.println("������ �� ���ڸ� �Է��Ͻÿ�.");
			b[i] = in.nextInt();
		}

		no.check(n, m, a, b);

	}
}
