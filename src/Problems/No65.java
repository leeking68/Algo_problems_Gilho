package Problems;

//1922 ��Ʈ��ũ ��

import java.util.Scanner;

public class No65 {

	static int[][] weight;
	static int[] key;
	static int v = 0;
	static int u = 0;
	static int knum = 0;
	static int result = 0;

	public static int prim(int num, int size,int start) {
//		do {
//			int temp = 100000;
//			for(int i = 1; i < size+1; i++) {
//				if(temp > weight[start][i]&&weight[start][i]!=0){
//					temp = weight[start][i];
//				}
//			}
//			for(int i = 1; i<size+1; i++) {
//				if(temp == weight[start][i]) {
//					key[]
//				}
//			}
//		}
		while(v < size) {
			int temp = 10000;
			int check = 0;
			for(int i = 1; i < size+1; i++) {
				if(weight[start][i]!=0&&temp >  weight[start][i]) {
					temp = weight[start][i];
					check = 1;
				}
				
			}
			if(check == 1) {
			key[knum] = temp;
			//�ѹ� �غ�
			result += temp;
			knum++;
			}
			for(int i = 0; i < size+1; i++) {
				if(temp == weight[start][i]) {
					prim(num, size, i);
				}
			}
			
			
		}
		return result;
		
		
		
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int lineN = sc.nextInt();

		weight = new int[n + 1][n + 1];
		key = new int[lineN];

		for (int i = 0; i < lineN; i++) {
			System.out.println(i);
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			weight[a][b] = c;
		}

		int rs = prim(v, n, 1);
		System.out.println(rs);

	}
}
