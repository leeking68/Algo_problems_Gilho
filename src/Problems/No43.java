package Problems;

//                 * ���� ��� ¥��� 4�׸��� �ֹ� �޾Ҵµ� 5�׸� �̻��� �丮���� ������, 4�׸��� �丮�� �� �ִ� ���� 3�׸� ������ �丮��
//                 * ���� �ʴ´�.
//                 * 
//                 * �غ��̰� 5�׸��� �ֹ� �޾Ұ�, �غ��̰� ������ �ִ� ���� ������ 1, 3�׸� ���̶�� ó���� 1,3�׸��� ���� ���ÿ�
//                 * �̿��Ͽ� 4�׸��� ����� ���� 1�׸��� ���� �̿��Ͽ� 1�׸��� ����� �� 5�׸��� �� ���� �丮�� ���� �� �ִ�.
//                 * 
//                 * �غ��̰� �ֹ� ���� ¥����� ���� ������ �ִ� ���� ũ�Ⱑ �־��� ��, �ּ� �� ���� �丮�� ��� �ֹ��� ó���� �� �ִ���
//                 * ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//                 * 
//                 * �Է� ù ��° �ٿ��� �غ��̰� �ֹ� ���� ¥����� ��N(1��N��10,000)�� ������ �ִ� ���� ����
//                 * M(1��M��1,000)�� �־�����. �� ��° �ٿ��� ���� ũ�� Si(1��Si��N)�� M���� �־����� ���� ũ���� ���� ����
//   * �� ������ ���� �� �ִ�.
//   * 
//  * ��� �غ��̰� ��� �ֹ��� ó���ϱ� ���� �ؾ� �ϴ� �ּ� �丮 Ƚ���� ����Ѵ�. ���� ��� �ֹ��� ó�� �� �� ���� ���
// * -1�� ����Ѵ�.
//
//���� �Է�  ����
//5 2
//1 3
//���� ���  ����
//2
//���� �Է� 2  ����
//6 2
//1 3
//���� ��� 2  ����
//2

import java.util.Scanner;

public class No43 {

	public int div(int N, int A) {

		if (N < A) {
			return N;
		}

		return N - A;

	}

	public int check(int N, int A[]) {

		for (int i = 0; i < A.length; i++) {
			System.out.println("check"+N+","+A[i]);
			if (N >= A[i]) {
				return 1;
			}
		}
//		System.out.println(-1);
		return -1;
	}

	public static void main(String args[]) {

		No43 no = new No43();

		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		int M = in.nextInt();

		int A[] = new int[M];

		for (int i = 0; i < M; i++) {
			A[i] = in.nextInt();
		}

		int temp = 0;
		int cnt = 0;
		int h = no.check(N, A);

		// �׸��� �˰����� ����ؾ� �ϹǷ� ���������� ���ش�.
		for (int i = 0; i < A.length; i++) {
			for (int j = i + 1; j < A.length; j++) {
				if (A[i] < A[j]) {
					temp = A[i];
					A[i] = A[j];
					A[j] = temp;
				}
			}
		}

		while (h != -1 || N > 0) {
			for (int i = 0; i < A.length; i++) {
				h = no.check(N, A);
				if (h == -1) {
					break;
				}
				int k = A[i];
				N = no.div(N, k);
				System.out.println("���� "+i+","+N);
				
			}
			System.out.println(","+N + "," + h);
			
			if (h != -1) {
				cnt++;
				System.out.println("���"+cnt);
			}
			System.out.println("===========================");
			
			
		}
		System.out.println("aaaa"+h);
		if (h != -1) {
			System.out.println("1" + cnt);
		} 
		System.out.println("2" + cnt);
	}

}
