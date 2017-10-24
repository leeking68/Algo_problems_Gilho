package Problems;
import java.util.Scanner;
import java.util.HashMap;

public class No2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a;
		System.out.println("�Է��� ����");

		a = in.nextInt();

		int[] num;
		num = new int[a];

	 for (int i = 0; i <= a - 1; i++) {
			
//			label1:
			System.out.println("�� �Է�");
			int b = in.nextInt();
			int count = 0;
			 for (int k = 1; k <= b; k++) {

				if (count <= 2) {

					if (b % k == 0) {
						count++;
					}
					
					if (count == 2) {

						num[i] = b;

					} 

				}
				

			}

		}


		System.out.println("num3 " + num[1]);
		 int max=0;
		 
		 for(int k=0;k<=a;a++) {
			 if(num[k]>max) {
		 max = num[k];
		 }

	  }
		 
		 System.out.println("����ū���� :" + max);

		

	}

}
