package Problems;

// N���� �������� �ְ�, ������ �����帶�� �����ڵ��� �ִ�. i�� �����忡 �ִ� �������� ���� Ai���̴�.
//
//�������� �Ѱ������� �ΰ��������� �� ������ �ִ�. �Ѱ������� �� �濡�� ������ �� �ִ� �������� ���� B���̰�, �ΰ������� �� �濡�� ������ �� �ִ� �������� ���� C���̴�.
//
//������ �����忡 �Ѱ������� ���� 1�� �־�� �ϰ�, �ΰ������� ���� �� �־ �ȴ�.
//
//�� �����帶�� ���û����� ��� �����ؾ� �Ѵ�. �� ��, �ʿ��� ������ ���� �ּҰ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//�Է�
//ù° �ٿ� �������� ���� N(1 �� N �� 1,000,000)�� �־�����.
//
//��° �ٿ��� �� �����忡 �ִ� �������� �� Ai (1 �� Ai �� 1,000,000)�� �־�����.
//
//��° �ٿ��� B�� C�� �־�����. (1 �� B, C �� 1,000,000)
import java.util.Scanner;

public class SSsw01 {

	public int mainTc(int mainTc, int A) {

		return A - mainTc;

	}

	public int subTc(int subTc, int B[], int classNum) {

		int count = 0;

		for (int b = 0; b < classNum; b++) {
		
			if(B[b]==0) {
				count = count;
			}
			
			else if (B[b] != 0 && B[b]<subTc) {
				count++;
				System.out.println("dd" + count);
			} else {
				int num = B[b] / subTc;
				int div = B[b] % subTc;

				if (div != 0) {
					num++;
				}

				count += num;
				System.out.println("kk" + count);
			}
		}
		

		return count;

	}

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		SSsw01 ss = new SSsw01();

		System.out.println("�������� ������ �Է��Ͻÿ� ");

		int classNum = in.nextInt();

		int A[] = new int[classNum];
		int B[] = new int[classNum];

		for (int i = 0; i < classNum; i++) {
			System.out.println("�����忡 �ִ� �����ڼ�");
			A[i] = in.nextInt();
		}

		System.out.println("�Ѱ������� ���� �Ҽ��ִ� ��� ");

		int mainTc = in.nextInt();

		for (int k = 0; k < classNum; k++) {
			int mainTcStu = ss.mainTc(mainTc, A[k]);
			B[k] = mainTcStu;
		}

		System.out.println("�ΰ������� ���� �� �� �ִ� ���");

		int subTc = in.nextInt();

		int check = ss.subTc(subTc, B, classNum);
		System.out.println("����" + check);

		System.out.println("����: " + (check + classNum));
		

	}

}

