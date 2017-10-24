package Problems;
import java.util.Scanner;

public class No20 {

	public void check(String ch) {

		int k = (ch.length() % 2);

		if (k == 0) {
			// ¦���ϰ��
			int h = ch.length() / 2;

			for (int i = 0; i < h - 1; i++) {
				if (ch.charAt(i) != ch.charAt((ch.length() - 1) - i)) {
					System.out.println("�縰����� �ƴմϴ�:" + 0);
					return;
				}
			}

		} else {
			// Ȧ���ϰ��
			int h = (ch.length() / 2) + 1;

			for (int i = 0; i < h - 1; i++) {
				if (ch.charAt(i) != ch.charAt((ch.length() - 1) - i)) {
					System.out.println("�縰����� �ƴմϴ�:" + 0);
					return;
				}
			}

		}

		System.out.println("�縰����Դϴ�. :" + 1);

	}

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		System.out.println("������ �Է��ϰ� Enter�� ġ�ÿ� : ");

		String ch = in.nextLine();

		No20 no = new No20();

		no.check(ch);

	}
}
