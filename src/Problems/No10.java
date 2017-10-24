package Problems;
import java.util.Scanner;


//seq = �����̶�� �� 

public class No10 {

	public static boolean End = false;
	public static int N ;

	public static boolean check(String seq, int sizeLength) {
		
		System.out.println(seq+"::::"+sizeLength);
		System.out.println(seq.length()+":��:::"+sizeLength);

		if (sizeLength == 0 || seq.length() == 1)
			return true;

		// �ڿ��� ���� 1, 2, 3... ������� ������ ���� �������� Ȯ���Ѵ�.
		if (seq.substring(seq.length() - sizeLength, seq.length())
				.equals(seq.substring(seq.length() - (sizeLength * 2), seq.length() - sizeLength))) 
		{
		
			return false;
		
		} else
			return check(seq, sizeLength - 1);
	}
	
	public static void perm(String seq, int size) {

		
		if (!check(seq, seq.length() / 2)) {
			return;
		}
		
		//���� �������� üũ�Ұ�


		if (size == N) {
			System.out.println(seq);
			End = true;
			return;
		}
		
		//���̰� �´ٸ� �� 

		for (int i = 1; i < 4; i++) {

			perm(seq + i, size + 1);

			if (End)
				return;
		}
		
		//���̰�
	}
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		in.close();
		// �ݾ��ִ°��� ���� ����
		// �ұԸ� ���α׷��ֿ����� ����� ������ , ��Ը� ���α׷��ֿ����� ������ �ִ�.

		perm("", 0);
	}

	


}
