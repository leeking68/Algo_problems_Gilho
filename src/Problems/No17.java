package Problems;

//14�� ���ذ湮�� 

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class No17 {

	public void map(int n, int num) {

		HashMap map = new HashMap();

		Random random = new Random();

		for (int k = 1; k <= n; k++) {

			int con = random.nextInt(); // int�� �������� ����

			int total = (con - num);

			map.put("con", con);
			map.put("total", total);
		}

		search(map, num);

	}

	public  String search(HashMap map, int num) {

		int h = 0;
		Iterator Keys = map.keySet().iterator();
		while (Keys.hasNext()) {
			String key = (String) Keys.next();

			int i = (int) map.get("con");

			int k = 0;

			if (k > i) {

				h = i;

			}

		}

		System.out.println("������ �� :" + h + "���� �Է��Ѽ� :" + num);
		return null;

	}

	public static void main(String args[]) {

		No17 no = new No17();
		
		Scanner in = new Scanner(System.in);

		System.out.println("��� ���� �� �� ���ΰ�?:");

		int n = in.nextInt();

		System.out.println("���Ҽ� �Է� :");

		int num = in.nextInt();

		no.map(n, num);

	}

}
