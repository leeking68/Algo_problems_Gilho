package Problems;
// 31/29 ���̳��� ���α׷��� 1�� ����� 

//X�� 3���� ������ ��������, 3���� ������.
//X�� 2�� ������ ��������, 2�� ������.
//1�� ����.
//���� N�� �־����� ��, ���� ���� ���� �� ���� ������ ����ؼ� 1�� ������� �Ѵ�. ������ ����ϴ� Ƚ���� �ּҰ��� ����Ͻÿ�.
//ù° �ٿ� ������ �ϴ� Ƚ���� �ּҰ��� ����Ѵ�.

import java.util.Scanner;

public class No31 {

	public int div2(int a) {
		int b = a / 2;

		return b;

	}

	public int div3(int a) {
		int b = a / 2;

		return b;

	}

	public int minus1(int a) {
		int b = a - 1;

		return b;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		No31 no = new No31();
		int count = 0;
		int a;
		System.out.println("�Է��� ���ڸ� �Է��Ͻÿ� : ");
		a = in.nextInt();

		while (a != 1) {

			if (a % 3 == 0 || a % 2 == 0) {
				if (a % 3 == 0) {
					a = no.div3(a);

					count++;
					System.out.println("dd:"+a+"zz :"+count);
				} else {

					a = no.div2(a);
					count++;
					System.out.println("dd:"+a+"zz :"+count);
				}

			} else {
				a = no.minus1(a);
				
				
				count++;
				System.out.println("dd:"+a+"zz :"+count);
			}
		}
		
		while(a!=1) {
			a-=1;
			
			
			
		}
		
		System.out.println("�严 :" +count);

	}

}
