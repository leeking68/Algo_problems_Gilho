package Problems;

//29/27 
//����
//n���� ������ �̷���� ������ ������ �־�����. �츮�� �� �� ���ӵ� �� ���� ���ڸ� �����ؼ� ���� �� �ִ� �� �� ���� ū ���� ���Ϸ��� �Ѵ�. ��, ���ڴ� �� �� �̻� �����ؾ� �Ѵ�.
//
//���� �� 10, -4, 3, 1, 5, 6, -35, 12, 21, -1 �̶�� ������ �־����ٰ� ����. ���⼭ ������ 12+21�� 33�� ������ �ȴ�.
//
//�Է�
//ù° �ٿ� ���� n(1��n��100,000)�� �־����� ��° �ٿ��� n���� ������ �̷���� ������ �־�����. ���� -1,000���� ũ�ų� ����, 1,000���� �۰ų� ���� �����̴�.
//
//���
//ù° �ٿ� ���� ����Ѵ�.
//
//���� �Է�  ����
//10
//10 -4 3 1 5 6 -35 12 21 -1
//���� ���  ����
//33

import java.util.Scanner;
import java.util.StringTokenizer;

public class No29 {

	public void check(int num[]) {
		System.out.println("dd" + num[0]);
		int temp1 = 0;
		int temp2 = 0;
		int temp = 0;
		int temp3 = 0;

//		StringTokenizer tokens = new StringTokenizer(str, ",");
//
//		for (int a = 1; tokens.hasMoreElements(); a++) {
//
//			num[a] = Integer.parseInt(tokens.nextToken());
//
//			// System.out.println( "����(��) " + x + " : " + tokens.nextToken() );
//		}

		for (int b = 0; b < num.length; b++) {

			if (num[b] > temp1) {
				temp1 = num[b];
			}
			
		}

		for (int b = 0; b < num.length; b++) {

			if (num[b] > temp2) {

				temp2 = num[b];
				
				if(temp2 < temp1) {
					temp3 = temp2;
				}
				
				System.out.println(temp1+"aa"+temp2 + "aa" + temp3);
			}
		}
		
		System.out.println(temp1 + "+" + temp3 + "="+(temp1+temp3));

	}

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

//		String str = in.nextLine();

		System.out.println("�Է� �� ���� :" );
	
		int x = in.nextInt();
		
		int num[] = new int[x];
		
		for(int a = 0; a < x; a++) {
			num[a] = in.nextInt();
		}
		
		
		No29 no = new No29();

		
		no.check(num);

	}
}
