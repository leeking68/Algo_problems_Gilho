package Problems;
// 1654 �� �����ڸ��� / ���͵� 19��

import java.util.Scanner;

public class No22 {
	
	public void check(int a[], int k, int n) {
		int big = 0;
		int total = 0;
		int temp;
		
		for(int i = 1; i < k; i++) {
			if(a[0] < a[i]) {
				big = a[i];
			}
		}
		
		for(int j = 1; j < 10000; j++ ) {
			temp = big/j;
			System.out.println("bbbb" + temp);
			for(int z = 0; z < k; z++) {
				int q =(a[z]/temp);
				total += q;
			}
			
			if(total == n) {
				System.out.println("������ �ִ���̴�  " + temp);
			}
		
			
		}
		
		
		
	}
	
	public static void main(String args[]) {
		No22 no = new No22();
		
		Scanner in = new Scanner(System.in);
		
		//k���� ����  -> �迭���ٰ� k�� ��ŭ ���� ���� �ֱ� 
		//n�� ��ŭ�� ��������� 
		
		System.out.println("K(�������ִ�)�� ���ڸ� �Է��Ͻÿ�.");
		int k = in.nextInt();
		
		System.out.println("N(��������ϴ�)�� ���ڸ� �Է��Ͻÿ�.");
		int n = in.nextInt();
		
		int a[] = new int[k];
		
		for(int i = 0; i < k; i++) {
			System.out.println(+(i+1)+"��° ���� �Է��Ͻÿ�");
			a[i] = in.nextInt();
		}
		
		no.check(a, k, n);
		
		
	}

}
