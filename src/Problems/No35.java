package Problems;
//����


//�����е� �˴ٽ��� �������� ������ ���� �������� �μ��ϰ��� �ϴ� ������ �μ� ����� ���� ��������Ρ�, �� ���� ��û�� ���� ���� �μ��Ѵ�. ���� ���� ������ ���δٸ� Queue �ڷᱸ���� �׿��� FIFO - First In First Out - �� ���� �μⰡ �ǰ� �ȴ�. ������ ����̴� ���ο� �����ͱ� ���� ����Ʈ��� �����Ͽ��µ�, �� �����ͱ�� ������ ���� ���ǿ� ���� �μ⸦ �ϰ� �ȴ�.
//
//���� Queue�� ���� �տ� �ִ� ������ ���߿䵵���� Ȯ���Ѵ�.
//������ ������ �� ���� �������� �߿䵵�� ���� ������ �ϳ��� �ִٸ�, �� ������ �μ����� �ʰ� Queue�� ���� �ڿ� ���ġ �Ѵ�. �׷��� �ʴٸ� �ٷ� �μ⸦ �Ѵ�.
//���� ��� Queue�� 4���� ����(A B C D)�� �ְ�, �߿䵵�� 2 1 4 3 ��� C�� �μ��ϰ�, �������� D�� �μ��ϰ� A, B�� �μ��ϰ� �ȴ�.
//
//�������� �� ����, ���� Queue�� �ִ� ������ ���� �߿䵵�� �־����� ��, � �� ������ �� ��°�� �μ�Ǵ��� �˾Ƴ��� ���̴�. ���� ��� ���� ������ C������ 1��°��, A������ 3��°�� �μ�ǰ� �ȴ�.
//
//�Է�
//ù �ٿ� test case�� ���� �־�����. �� test case�� ���ؼ� ������ �� N(100����)�� �� ��°��
//�μ�Ǿ����� �ñ��� ������ ���� Queue�� � ��ġ�� �ִ����� �˷��ִ� M(0�̻� N�̸�)�� �־�����. 
//�����ٿ� N�� ������ �߿䵵�� �־����µ�, �߿䵵�� ������ ������ int������ �־�����. 
//�߿䵵�� ���� ������ ���� �� ���� ���� �ִ�. ���� ���� N=4, M=0(A������ �ñ��ϴٸ�), �߿䵵�� 2 1 4 3�� �ȴ�.
//
//���
//�� test case�� ���� ������ �� ��°�� �μ�Ǵ��� ����Ѵ�.
//
//���� �Է�  ����
//3
//1 0
//5
//4 2
//1 2 3 4
//6 0
//1 1 9 1 1 1
//���� ���  ����	
//1
//2
//5

import java.util.HashMap;
import java.util.Scanner;




//Hash�ε� �غ��� ����ϱ�  
public class No35 {
	
	public void queue(String A[], int B[], int n) {
		int temp;
		int a;
		int b;
		int C[] = new int[n];
		int temp1 = 0;
		for(int i = 0; i < n; i++) {
			temp = B[i];
			
			for(int j = i+1; j < n; j++) {
				if(temp<B[j]) {
					temp = B[i+1];
				} 
			}
			System.out.println("zz"+temp);
			C[i] = temp;
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				if(C[i] == B[j]) {
					temp1 = j;
				}
			}
//			String K = A[temp1].toString();
			System.out.print(A[temp1]);
		}
		
	}
	
	public static void main(String args[]) {
		
		No35 no = new No35();
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("������ ������ �Է��Ͻÿ�");
		
		int n = in.nextInt();
		String A[] = new String[n];
		int B[] = new int[n];
		
		for(int i = 0; i < n; i++){
			System.out.println("������ �Է��Ͻÿ�.");
			A[i] = in.next();
			System.out.println("������ �켱������ �Է��Ͻÿ�.");
			B[i] = in.nextInt();
		}
		
		no.queue(A, B, n);
		
	}
}
