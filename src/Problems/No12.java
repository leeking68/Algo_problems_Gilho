package Problems;
import java.util.Scanner;

//ATM���� 

public class No12 {
	static int[] k;

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);
		int cnt;
		System.out.println("������ :? ");
		cnt = Integer.parseInt(in.nextLine());

		// ���� ���� ��ŭ �迭����
		k = new int[cnt];

		// ������ �ٲٱ� ���� �ӽú���
		int temp;
		// ���� ���ϱ����� ����
		int total = 0;

		//�迭�� �Է°��޴� ��� 
		System.out.println("������ �Է��Ͻÿ� : ");
		for (int i = 0; i < cnt; i++)
			k[i] = Integer.parseInt(in.nextLine());

		// ���� ���� ��� �����ϱ�

		for (int i = 0; i < k.length - 1; i++) {
			for (int j = 0; j < k.length - 1; j++) {
				if (k[j] > k[j + 1]) {
					temp = k[j];
					k[j] = k[j + 1];
					k[j + 1] = temp;
				}
			}
		}

		// �Ǻ���ġ ���� �̿��ϱ�

		for (int i = 0; i < k.length; i++) {
			for (int j = 0; j <= i; j++) {
				total += k[j];
			}
		}

		System.out.println(total);

	}

}
