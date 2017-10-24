package Problems;

//����
//��ȣ�� ���Ǵ�� T ��Ż��� �� �ڵ��� �ȸӳ��� ���. ���Ǵ�� T ��Ż�� ��ȣ���� ���� �� ���� ����� �� �ϳ��� �����϶�� �ߴ�.
//
//���� �����
//�ν� �����
//���� ������� 30�ʸ��� 10���� û���ȴ�. �� ���� ���� 29�� �Ǵ� �� ���� ���� �ð� ��ȭ�� ������ 10���� û���ȴ�. ���� 30�ʺ��� 59�� ���̷� ��ȭ�� ������ 20���� û���ȴ�.
//
//�ν� ������� 60�ʸ��� 15���� û���ȴ�. �� ���� ���� 59�� �Ǵ� �� ���� ���� �ð� ��ȭ�� ������ 15���� û���ȴ�. ���� 60�ʺ��� 119�� ���̷� ��ȭ�� ������ 30���� û���ȴ�.
//
//��ȣ�� ���� �޿� ���Ǵ�� T ��Ż縦 �̿��� �� ��ȭ �ð� ����� �־����� ��� ������� ��� �ϴ� ���� �������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//�Է�
//��ȣ ���� �޿� �̿��� ��ȭ�� ���� N�� �־�����. N�� 20���� �۰ų� ���� �ڿ����̴�. ��° �ٿ� ��ȭ �ð� N���� �־�����.
//
//���
//ù° �ٿ� �� ������� �̸��� ����Ѵ�. �� �Ŀ� ������ ���̿� �ΰ� ����� �� �� �������� ����Ѵ�. ���� �� ������� ����� ��� ������ ������ ���� ���� �ν��� �� ������ ����.
//
//������ Y��, �ν��� M���� ����Ѵ�.

import java.util.Scanner;

public class No45 {

	public int yResult(String A[]) {
		int sum = 0;

		for (int i = 0; i < A.length; i++) {

			sum += 10 * (Integer.parseInt(A[i]) / 31 + 1);

		}

		return sum;
	}

	public int mResult(String A[]) {

		int sum = 0;

		for (int i = 0; i < A.length; i++) {

			sum += 15 * (Integer.parseInt(A[i]) / 60 + 1);
		}

		return sum;
	}

	public static void main(String args[]) {

		No45 no = new No45();

		String A[];
		
		Scanner in = new Scanner(System.in);

		int n = Integer.parseInt(in.nextLine());
		
		A = in.nextLine().split(" ");


		int y = no.yResult(A);

		int m = no.mResult(A);

		if(y==m)System.out.print("Y ");
		System.out.printf("%c %d", y < m ? 'Y' : 'M', y < m ? y : m);
		
		in.close();


	}
}
