package Problems;
import java.util.Scanner;

//
//2048 ������ 4��4 ũ���� ���忡�� ȥ�� ���� ����ִ� �����̴�. �� ��ũ�� ������ ������ �غ� �� �ִ�.
//
//�� ���ӿ��� �� ���� �̵��� ���� ���� �ִ� ��ü ���� �����¿� �� ���� �� �ϳ��� �̵���Ű�� ���̴�. �� ��, 
//���� ���� ���� �� ���� �浹�ϸ� �� ���� �ϳ��� �������� �ȴ�. �� ���� �̵����� �̹� ������ ���� �� �ٸ� ���� �ٽ� ������ �� ����.
//(���� ���ӿ����� �̵��� �� �� �� ������ ���� �߰�������, �� �������� ���� �߰��Ǵ� ���� ����)
public class SSsw02 {

	public void up(int A[][], int num) {
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {

				if (A[i][j] == 0) {
					A[i][j] = A[i + 1][j];

				}

				if (A[i][j] == A[i + 1][j]) {
					A[i][j] += A[i + 1][j];
				}
			}
		}

	}

	public void down(int A[][], int num) {
		for (int i = num - 1; i == 0; i--) {
			for (int j = 0; j < num; j++) {
				if (A[i][j] == 0) {
					A[i][j] = A[i - 1][j];

				}

				if (A[i][j] == A[i - 1][j]) {
					A[i][j] += A[i - 1][j];
				}
			}
		}

	}

	public void right(int A[][], int num) {
		for (int j = 0; j < num; j++) {
			for (int i = 0; i < num; i++) {
				if (A[i][j] == 0) {
					A[i][j] = A[i][j + 1];

				}

				if (A[i][j] == A[i][j + 1]) {
					A[i][j] += A[i][j + 1];
				}
			}
		}

	}

	public A[][] left(int A[][], int num) {
	
				
	}

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		SSsw02 ss = new SSsw02();

		System.out.println("���� ���� �Է��Ͻÿ� ");

		int num = in.nextInt();

		int A[][] = new int[num][num];

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.println("[" + i + "]" + "," + "[" + j + "]" + "��°���ڸ� �Է��Ͻÿ�");
				A[i][j] = in.nextInt();
			}
		}

		int count = 0;
		int check = 0;

		int B[] = new int[1024];	
		
		for (int k = 0; k < num; k++) {

			int random = (int) (Math.random() * 10) - 6;

			for (int f = 0; f < 1024; f++) {
				
				while (count == 4) {
					switch (random) {

					case 0:
						for (int i = 0; i < num; i++) {
							for (int j = 0; j < num; j++) {

								if (A[i][j] == 0) {
									A[i][j] = A[i + 1][j];

								}

								if (A[i][j] == A[i + 1][j]) {
									A[i][j] += A[i + 1][j];
								}
							}
							count++;
						}

					case 1:
						for (int i = num - 1; i == 0; i--) {
							for (int j = 0; j < num; j++) {
								if (A[i][j] == 0) {
									A[i][j] = A[i - 1][j];

								}

								if (A[i][j] == A[i - 1][j]) {
									A[i][j] += A[i - 1][j];
								}
							}
							count++;
						}

					case 2:
						for (int j = 0; j < num; j++) {
							for (int i = 0; i < num; i++) {
								if (A[i][j] == 0) {
									A[i][j] = A[i][j + 1];

								}

								if (A[i][j] == A[i][j + 1]) {
									A[i][j] += A[i][j + 1];
								}
							}
							count++;
						}


					case 3:
						for(int j = 0; j < num; j++) {
							for(int i = 0; i < num; i++) {
								if(A[i][j]==0) {
									A[i][j]=A[i][j-1];
										
								}
								
								if(A[i][j]==A[i+1][j]) {
									A[i][j]+=A[i][j-1];
								}
							}
							
							count++;
						}
					}
					
					for(int j = 0; j < num-1; j++) {
						for(int i = 0; i < num-1; i++) {
						   if(A[i][j] < A[i+1][j]) {
							  
							   check = A[i+1][j];
						   }
						   
						   if(A[i][j] < A[i][j+1]) {
								  
							   check = A[i][j+1];
						   }
						   
						   
						}
						
					}
					
					
					
				}
				
					B[f] = check;

			}

		}
		
		int kkkk = B[0];
		
		for(int y = 0; y < 1024-1; y++) {
			
			if(B[y] < B[y+1]) {
				
				kkkk = B[y+1] ;
				
			}
		}
		
		System.out.println("����" + kkkk);

	}

}
