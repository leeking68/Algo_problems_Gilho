package Problems;

//0���� ũ�ų� ����, 99���� �۰ų� ���� ������ �־��� �� ������ ���� ������ �� �� �ִ�. ���� �־��� ���� 10���� �۴ٸ� �տ� 0�� �ٿ� �� �ڸ� ���� �����, �� �ڸ��� ���ڸ� ���Ѵ�. �� ����, �־��� ���� ���� ������ �ڸ� ���ڿ� �տ��� ���� ���� ���� ������ �ڸ� ���ڸ� �̾� ���̸� ���ο� ���� ���� �� �ִ�. ���� ���� ����.
//
//26���� �����Ѵ�. 2+6 = 8�̴�. ���ο� ���ڴ� 68�̴�. 6+8 = 14�̴�. ���ο� ���ڴ� 84�̴�. 8+4 = 12�̴�. ���ο� ���ڴ� 42�̴�. 4+2 = 6�̴�. ���ο� ���ڴ� 26�̴�.
//
//���� ���� 4������ ���� ���ڷ� ���ƿ� �� �ִ�. ���� 26�� ����Ŭ�� ���̴� 4�̴�.
//
//N�� �־����� ��, N�� ����Ŭ�� ���̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

import java.util.Scanner;

public class No33replace {
	static No33replace no = new No33replace();
	// true false �������� ���Ѵ��� ���ο��� �ص��ǳ� , �� �ܰ踦 ���̱����ؼ� ȣ���ѱ迡 �ذ��ϱ�
	
	//���ڸ� ���ڸ� üũ 
	public int isCheck(int num) {

		if (0 < num && num < 10) {
			String ch = Integer.toString(num);
			StringBuffer ch1 = new StringBuffer(ch);
			StringBuffer ch2 = new StringBuffer("0");
			ch2.append(ch1).toString();
			String str = ch2.toString();
			int num2 = Integer.parseInt(str);
			return num2;
		}
		return num;
	}
	
	//������ ���� ����� �޼ҵ� 
	public int isHap(int num) {
		
		int sum = 0;
		int sum2 = 0;
		String ch = Integer.toString(num);
		
		for (int i = 0; i < 2; i++) {
			sum2 += Integer.parseInt(String.valueOf(ch.charAt(i)));
		}
		System.out.println("sum2 + " + sum2);
		int RR;
		if(sum2<0) {
			RR = no.isCheck(sum2);
			return RR;
		}
		
		else {
			return sum2;
		}
		
	}

	//���ο� ���� ���� �޼ҵ� 
	public int isDiv(int num,int num2) {
		String ch = Integer.toString(num);
		StringBuffer ch1 = new StringBuffer(ch.lastIndexOf(ch));
		String ch2 = Integer.toString(num2);
		StringBuffer ch3 = new StringBuffer(ch2.lastIndexOf(ch2));
		ch1.append(ch3).toString();
		System.out.println("ch1:"+ch1+"ch3"+ch3);
		String str = ch1.toString();
		int num3 = Integer.parseInt(str);
		
		return num3;
		
	}

	public int divNo(int m1, int temp, int count) {
		System.out.println("����Ŭ�� ���� �� �� ���Ͻÿ� " + m1);
		int sum = 0;
		int sum2 = 0;
		String ch = Integer.toString(m1);

		for (int i = 0; i < 2; i++) {
			sum2 += Integer.parseInt(String.valueOf(ch.charAt(i)));
			
		}
		if (sum2 != temp) {
			 while(sum2==temp) {
			count++;
			for (int i = 0; i < 2; i++) {
				sum += Integer.parseInt(String.valueOf(ch.charAt(i)));
			}

			m1 = sum;
			 }
			return count;
		}
		return count;
	}
	
	
	
	

	public static void main(String[] args) {

		

		Scanner in = new Scanner(System.in);

		System.out.println("����Ŭ�� ���� �� �� ���Ͻÿ� ");


		// ���� ��
		// temp : ���߿� ���� ��
		int num = in.nextInt();
		int temp = num;
		int count = 0;
		
		if (num <= 0) {
			System.out.println("�ٻ� �Է��Ͻÿ� :");
			num = in.nextInt();
		}
		
		do {
			
			count++;
			int a = no.isCheck(num);
			int b = no.isHap(a);
			if(b<10) {
				b = no.isCheck(b);
			}
			int c = no.isDiv(a, b);
			
			
//			
			if(c==temp) {
				num=c;
			}
			
		} while(num!=temp);
		
		System.out.println("���� :"+count);

	

}
	}
