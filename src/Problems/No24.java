package Problems;

//���͵� 20�� ���� 11404�� �÷��̵� 
import java.util.Arrays;
import java.util.Scanner;

public class No24 {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		System.out.println("������ ������ �Է��Ͻÿ� : ");
		int cityNum = in.nextInt();

		System.out.println("������ ������ �Է��Ͻÿ� : ");
		int busNum = in.nextInt();

		int floid[][] = new int[cityNum][cityNum];

		for (int i = 0; i < busNum; i++) {
			System.out.println("����� ���� ��ȣ�� �����ÿ� :");
			int a = in.nextInt();
			System.out.println("������ ���� ��ȣ�� �����ÿ� :");
			int b = in.nextInt();
			System.out.println("������ ����ġ�� �����ÿ� : ");
			int c = in.nextInt();
			System.out.println("a:"+a+"b"+b+"c"+c);
			
			for (int k = 0; k < busNum; k++) {

				for (int j = 0; j < busNum; j++) {

					if (a == k && b == j) {
						if (floid[k][j] > c) {
							floid[k][j] = c;
						}
					}

				}

			}
		}

		System.out.println("--" + Arrays.deepToString(floid));

	}
}
