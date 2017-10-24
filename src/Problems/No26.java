package Problems;

//26/24 Daum �Ի���� ���� ����ª�� �Ÿ��� ���� ���� ���ϱ� 
import java.util.Scanner;

public class No26 {

	public void check(int num[], int a) {
		double ch = 0;
		double min[] = new double[2];

		for (int i = 0; i < a - 1; i++) {
			for (int j = i + 1; j < a; j++) {

				if (j == a - 1) {
					num[j] = num[a];
				}

				double chNum = Math.abs(num[i] - num[j]);
				System.out.println("i " + i + " j " + j);
				System.out.println("chNum " + chNum);

				if (ch > chNum) {
					ch = chNum;
					min[0] = num[i];
					min[1] = num[j];
					System.out.println(ch + "," + min[0] + "," + min[1]);
				}
			}

		}

		System.out.print(min[0]);
		System.out.println(min[1]);
	}

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		System.out.println("�迭�� ���ڸ� �����ÿ� : ");
		int a = in.nextInt();

		int num[] = new int[a];

		for (int i = 0; i < a; i++) {
			System.out.println("���ڵ��� �Է��Ͻÿ�:");
			num[i] = in.nextInt();
		}

		No26 no = new No26();

		no.check(num, a);

	}
}
