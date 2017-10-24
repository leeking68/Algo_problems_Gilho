package Problems;
import java.util.Scanner;

public class No8 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int a, b, c;
		System.out.println("X : ");
		a = in.nextInt();
		System.out.println("Y(����) : ");
		b = in.nextInt();
		System.out.println("Z(��ǥ) : ");
		c = in.nextInt();
		
		//��ǥ�������� �������� ��ġ�� ���� ��
		//���� Ƚ���� ���� Ƚ���� ���Ѵ�.
		/**
		 * f�� 0�̶�� e->���̵ȴ�. ���̻� �� ������ ���� �����̴�.
		 * f�� 0�̾ƴ϶�� --> 0<f<b������ �ѹ��� ���ٸ�ȴ� --> +1
		 */
		int e,f,d;
		d = c-a; 
		e =(d/b);
		f =(d%b);
		
		if(f==0) {
			System.out.println("Ƚ���� :" + e);
			
		} else {

			e += 1;
			System.out.println("Ƚ���� :" + e);
		}

	}

}
