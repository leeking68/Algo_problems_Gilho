package Problems;
import java.util.Scanner;

//35/37 SW���� ��

//�ֻ��� ������
//�ð� ����        �޸� ����        ����        ����        ���� ���        ���� ����
//2 ��        512 MB        2662        772        628        32.640%
//����
//ũ�Ⱑ N��M�� ������ �����Ѵ�. ������ �������� ����, ������ �����̴�. �� ������ ���� �ֻ����� �ϳ� ������ ������, �ֻ����� �������� �Ʒ��� ����. ������ ��ǥ�� (r, c)�� ��Ÿ����, r�� �������κ��� ������ ĭ�� ����, c�� �������κ��� ������ ĭ�� �����̴�. 
//
//  2
//4 1 3
//  5
//  6
//�ֻ����� ���� ���� �� ���� 1�̰�, ������ �ٶ󺸴� ������ 3�� ���·� ������ ������, ������ �ִ� ���� ��ǥ�� (x, y) �̴�. ���� ó���� �ֻ������� ��� �鿡 0�� ������ �ִ�.
//
//������ �� ĭ���� ������ �ϳ��� ������ �ִ�. �ֻ����� ������ ��, �̵��� ĭ�� �� �ִ� ���� 0�̸�, �ֻ����� �ٴڸ鿡 �� �ִ� ���� ĭ�� ����ȴ�. 0�� �ƴ� ��쿡�� ĭ�� �� �ִ� ���� �ֻ����� �ٴڸ����� ����Ǹ�, ĭ�� �� �ִ� ���� 0�� �ȴ�.
//
//�ֻ����� ���� ���� ��ǥ�� �̵���Ű�� ����� �־����� ��, �ֻ����� �̵����� �� ���� ��ܿ� �� �ִ� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//�ֻ����� ������ �ٱ����� �̵���ų �� ����. ���� �ٱ����� �̵���Ű���� �ϴ� ��쿡�� �ش� ����� �����ؾ� �ϸ�, ��µ� �ϸ� �ȵȴ�.
//
//�Է�
//ù° �ٿ� ������ ���� ũ�� N, ���� ũ�� M (1 �� N, M �� 20), �ֻ����� ���� ���� ��ǥ x y(0 �� x �� N-1, 0 �� y �� M-1), �׸��� ����� ���� K (1 �� K �� 1,000)�� �־�����.
//
//��° �ٺ��� N���� �ٿ� ������ �� �ִ� ���� ���ʺ��� ��������, �� ���� ���ʺ��� ���� ������� �־�����. �ֻ����� ���� ĭ�� �� �ִ� ���� �׻� 0�̴�. ������ �� ĭ�� �� �ִ� ���� 10�� ���� �ʴ� �ڿ����̴�.
//
//������ �ٿ��� �̵��ϴ� ����� ������� �־�����. ������ 1, ������ 2, ������ 3, ������ 4�� �־�����.
//
//���
//�̵��� ������ �ֻ����� �� �鿡 �� �ִ� ���� ����Ѵ�. ���� �ٱ����� �̵���Ű���� �ϴ� ��쿡�� �ش� ����� �����ؾ� �ϸ�, ��µ� �ϸ� �ȵȴ�.

public class No37 {

	static int East = 1;
	static int West = 2;
	static int North = 3;
	static int South = 4;
	static int temp = 0;

	public void right(int map[][], int N, int M, int whereX, int whereY, int dice[]) {
		// 3 1 4 �ظ�6
		// 1 ���4 6 �ظ�3 �̰���üũ

		// if(whereX < N) {
		// ���� üũ
		// }

		int row = whereX;
		int col = whereY + 1;
	
		
		if (map[row][col] == 0) {
			System.out.println("��� ��:" + dice[4]);
			map[row][col] = dice[3];
		} else {
			System.out.println("��� ��:" + dice[4]);
			dice[3] = map[row][col];
		}
		
		temp = dice[1];
		dice[1] = dice[4];
		dice[4] = dice[6];
		dice[6] = dice[3];
		dice[3] = temp;

	}

	public void left(int map[][], int N, int M, int whereX, int whereY, int dice[]) {
		// 4 1 3 �ظ�6
		// 1 ���3 6 �ظ�4
		int row = whereX;
		int col = whereY - 1;

		if (map[row][col] == 0) {
			System.out.println("��� ��:" + dice[3]);
			map[row][col] = dice[4];
		} else {
			System.out.println("��� ��:" + dice[3]);
			dice[4] = map[row][col];
		}
		
		temp = dice[1];
		dice[1] = dice[3];
		dice[4] = dice[6];
		dice[6] = dice[4];
		dice[3] = temp;
	}

	public void up(int map[][], int N, int M, int whereX, int whereY, int dice[]) {
		// 5 1 2 �ظ�6
		// 1 ���2 6 �ظ�5

		int row = whereX - 1;
		int col = whereY;

		// 0�̸� �ֻ����� ����
		if (map[row][col] == 0) {
			System.out.println("��� ��:" + dice[2]);
			map[row][col] = dice[5];
		} else {
			System.out.println("��� ��:" + dice[2]);
			dice[5] = map[row][col];
		}
		
		temp = dice[1];
		dice[1] = dice[2];
		dice[4] = dice[6];
		dice[6] = dice[5];
		dice[3] = temp;
	}

	public void down(int map[][], int N, int M, int whereX, int whereY, int dice[]) {
		// 2 1 5 �ظ�6
		// 1 ���5 6 �ظ�2

		int row = whereX + 1;
		int col = whereY;

		if (map[row][col] == 0) {
			System.out.println("��� ��:" + dice[5]);
			map[row][col] = dice[2];
		} else {
			System.out.println("��� ��:" + dice[5]);
			dice[2] = map[row][col];
		}
		
		temp = dice[1];
		dice[1] = dice[5];
		dice[4] = dice[6];
		dice[6] = dice[2];
		dice[3] = temp;
	}

	public static void main(String args[]) {

		No37 no = new No37();

		Scanner in = new Scanner(System.in);

		System.out.println("row �Է� :");
		int N = in.nextInt();
		System.out.println("col �Է� : ");
		int M = in.nextInt();
		
		int dice[] = new int[6];
		System.out.println("aa"+dice.length);
		for (int i = 0; i < 6; i++) {
			dice[i] = 0;
		}

		// map
		int map[][] = new int[N][M];

		System.out.println("�ֻ����� x��ǥ");
		int whereX = in.nextInt();
		System.out.println("�ֻ����� Y��ǥ");
		int whereY = in.nextInt();

		System.out.println("��ɾ��� ����");
		int k = in.nextInt();
		// ��ɾ�
		int cmd[] = new int[k];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.println("map[" + i + "]" + "[" + j + "]�� ��");
				map[i][j] = in.nextInt();
			}
		}

		for (int i = 0; i < k; i++) {
			System.out.println(+i + "��° ��ɾ� �Է� ");
			cmd[i] = in.nextInt();
		}

		for (int i = 0; i < k; i++) {
			// command
			int a = cmd[i];

			switch (a) {

			case 1:
//				no.right(map, N, M, whereX, whereY, dice);
				
				int row = whereX;
				int col = whereY + 1;
			
				
				if (map[row][col] == 0) {
					System.out.println("��� ��:" + dice[3]);
					map[row][col] = dice[2];
				} else {
					System.out.println("��� ��:" + dice[3]);
					dice[2] = map[row][col];
				}
				
				temp = dice[0];
				dice[0] = dice[3];
				dice[3] = dice[5];
				dice[5] = dice[2];
				dice[2] = temp;
				break;
			case 2:
//				no.left(map, N, M, whereX, whereY, dice);
				 row = whereX;
				 col = whereY - 1;

				if (map[row][col] == 0) {
					System.out.println("��� ��:" + dice[2]);
					map[row][col] = dice[3];
				} else {
					System.out.println("��� ��:" + dice[2]);
					dice[3] = map[row][col];
				}
				
				temp = dice[0];
				dice[0] = dice[2];
				dice[3] = dice[5];
				dice[5] = dice[3];
				dice[2] = temp;
				break;
			case 3:
//				no.up(map, N, M, whereX, whereY, dice);

				 row = whereX - 1;
				 col = whereY;

				// 0�̸� �ֻ����� ����
				if (map[row][col] == 0) {
					System.out.println("��� ��:" + dice[1]);
					map[row][col] = dice[4];
				} else {
					System.out.println("��� ��:" + dice[1]);
					dice[4] = map[row][col];
				}
				
				temp = dice[0];
				dice[0] = dice[1];
				dice[3] = dice[5];
				dice[5] = dice[4];
				dice[2] = temp;
				break;
			case 4:
//				no.down(map, N, M, whereX, whereY, dice);
				 row = whereX + 1;
				 col = whereY;

				if (map[row][col] == 0) {
					System.out.println("��� ��:" + dice[4]);
					map[row][col] = dice[1];
				} else {
					System.out.println("��� ��:" + dice[4]);
					dice[1] = map[row][col];
				}
				
				temp = dice[0];
				dice[0] = dice[4];
				dice[3] = dice[5];
				dice[5] = dice[1];
				dice[2] = temp;
				break;

			}

		}

	}

}
