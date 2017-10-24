package Problems;
import java.util.Scanner;

//���ؾ˰���  1065   32/30
public class No32 {
	static No32 no = new No32();

	public int check(int b) {
		String c = String.valueOf(b);
		
		
		int q = c.indexOf(1) - c.indexOf(0);
		int w = c.indexOf(2) - c.indexOf(1);
		
		if(Math.abs(q)==Math.abs(w)) {
			return 1;
		} else {
			return 0;
		}
		
		
//      ���� ���ڿ� ������ ���ٸ� �̷������� ���� �ϸ� �� �� �̴�. 		
//		for (int i = 0; i < c.length(); i++) {
//
//			if (i + 2 == c.length()) {
//				return 0;
//			}
//
//			int q = c.indexOf(i + 1) - c.indexOf(i);
//			int w = c.indexOf(i + 2) - c.indexOf(i);
//
//			if (Math.abs(q) == Math.abs(w)) {
//			} else if (Math.abs(q) != Math.abs(w)) {
//
//				return 0;
//
//			}
//
//		}

//		return 1;
	}

	public String sum(int a) {
		int count = 100;
		if (a < 100) {
			return "���� : " + a;
		} else {
			for (int b = 101; b < a; b++) {
				int k = no.check(b);

				if (k == 1) {
					count++;
				}

			}

			return "����" + count;

		}

	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.print("N�� �Է��Ͻÿ� ");
		int a = sc.nextInt();

		no.sum(a);

	}
}
