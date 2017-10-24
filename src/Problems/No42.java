package Problems;
import java.util.Scanner;

// ��Ģ���� ���� ���� No42
//����̴� ���� �������忡�� ������ ����ϰ� �ִ�. ����̴� ���� �������Կ� ������ ��Ȯ�ϰ� Nų�α׷��� ����ؾ� �Ѵ�. �������忡�� ����� ������ ������ ����� �ִ�. ������ 3ų�α׷� ������ 5ų�α׷� ������ �ִ�.
//
//����̴� ������ ������, �ִ��� ���� ������ ��� ������ �Ѵ�. ���� ���, 18ų�α׷� ������ ����ؾ� �� ��, 3ų�α׷� ���� 6���� �������� ������, 5ų�α׷� 3���� 3ų�α׷� 1���� ����ϸ�, �� ���� ������ ������ ����� �� �ִ�.
//
//����̰� ������ ��Ȯ�ϰ� Nų�α׷� ����ؾ� �� ��, ���� �� ���� �������� �Ǵ��� �� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//�Է�
//ù° �ٿ� N�� �־�����. (3 �� N �� 5000)
//
//���
//����̰� ����ϴ� ������ �ּ� ������ ����Ѵ�. ����, ��Ȯ�ϰ� Nų�α׷��� ���� �� ���ٸ� -1�� ����Ѵ�.
//
//���� �Է�  ����
//18
//���� ���  ����
//4
// int temp = 0;
// for (int j = 1; j < i; j++) {
//
// // int modA[] = new int[j];
//
// int k = i % j;
//
// if (k == 0) {
// if (j > M) {
// if()
// }
//
// if (temp < j) {
// temp = j;
// }
//
// }

//count = 0;
//temp = 0;
//
//for (int i = 2; i < num; i++) {
//	if (num % i == 0)
//		count += 1;
//
//	if (count == 0) {
//		
//		System.out.println("zz"+num);
//		
//		if (num > temp) {
//			temp = num;
//		}
//	}
//}

public class No42 {

	
	public int check(int n) {
	int cnt = 0;
	
	while(n>0) {
		int a = n/5;
		int b = a%5;
		
		if(b<2) {
			return -1;
		}
		
		int c = b/3;
		int d = b%3;
		
		if(d==0){
			return a + c;
		}
		
		
	}
	return -1;
		
	}
	
	public static void main(String args[]) {
		
		No42 no = new No42();
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int cnt = no.check(n);
		
		System.out.println("���� :"+cnt);
	}
}
