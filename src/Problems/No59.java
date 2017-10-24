package Problems;
//����2869�� �����̴� �ö󰡰� �ʹ�.

import java.util.Scanner;

public class No59 {
	
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		
		// up = �ö� �� �� �ִ� ���� down = �������� ���� goal = ��ǥ 
		int up = in.nextInt();
		int down = in.nextInt();
		int goal = in.nextInt();
		
		int day = 1;
		int now = 0;
		
		//now,down�� �ϸ� �Ϸ簡 ���� --> day++
		// goal < ���簡 �Ǿ�� ���� ��
		while(now<goal) {
			now += up;
			down -= down;
			
			day++;
		}
		
		System.out.println("��:"+day);
		
	}
}
