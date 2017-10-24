package Problems;
import java.util.Scanner;

//���ؾ˰��� 1152�� 

public class No18 {

	public void check(String sentence) {

		int cnt = 0;
		for (int n = 0; n < sentence.length() - 1; n++) {

			if (sentence.charAt(n) == ' ') {

				cnt++;

			}
		}

		int check = cnt + 1;

		System.out.println("�ܾ��� ������  : " + check);
	}

	public static void main(String args[]) {

		No18 no = new No18();

		Scanner in = new Scanner(System.in);

		System.out.println("������ �Է��ϰ� Enter�� ġ�ÿ� : ");
		String sentence = in.nextLine();

		no.check(sentence);
	}

}
