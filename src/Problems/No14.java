package Problems;
import java.util.Scanner;

public class No14 {
	static int k[] = { 500, 100, 50, 10, 5, 1 };

	
	public static void main(String args[]) {
		int total = 0;
		int limMoney = 1000;

		Scanner in = new Scanner(System.in);

//		int temp;
		int pay;
		System.out.println("�󸶸� �����ΰ�?:");
		pay = in.nextInt();

		int reMoney = limMoney - pay;
		int coin;
		int coinCnt;

			for (int j = 0; j < k.length - 1; j++) {

				if (reMoney < k[j]) {

					coin = reMoney;
				} else {

					coin = k[j];

				}

				coinCnt = reMoney / coin;

				total += coinCnt;

				reMoney -= (k[j] * coinCnt);

				if (reMoney == 0) {
					System.out.println("�� ������ : " + total);
					return;
				}

			}


	}

}
