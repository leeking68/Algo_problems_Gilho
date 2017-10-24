package Problems;
//11047�� �׸���˰��� ��������

import java.util.Scanner;
public class No60 {
	
	public int grid(int N, int K, int A[]) {
		int total = 0;
		
		for(int i = A.length-1; i >=0; i--) {
			System.out.println(i+"kkkk"+A.length);
			if(K > A[i]) {
				total += K/A[i];
				K = K%A[i];
			}
		}
		
		if(K!=0) {
			return -1;
		}
		return total;
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		No60 no = new No60();
		
		int N = in.nextInt();
		int K = in.nextInt();
		int[] A = new int[N];
		
		for(int i = 0; i < A.length; i++) {
			A[i] = in.nextInt();
		}
		
		in.close();
		
		int result = no.grid(N,K,A);
		
		System.out.println(result);
		
		
	}

}
