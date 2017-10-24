package Problems;
// 버블 정렬 no1571

import java.util.Scanner;


public class No47 {

	public void buble(int A[]) {
		
		int temp;
		
		for(int i = 0; i < A.length; i++) {
			for(int j = 0; j< A.length-1; j++) {
				if(A[j] > A[j+1]) {
					temp = A[j];
					A[j] = A[j+1];
					A[j+1] = temp;
				}
				
//				for(int k = 0; k < A.length; k++) {
//					System.out.print(A[k]+"|");
//				} 
//					System.out.println("===");
			}
		}
		
		for(int k = 0; k < A.length; k++) {
		System.out.print(A[k]);
	} 
}
		
		
	
	public static void main(String args[]){
		
		No47 no = new No47();
		
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		int A[]  = new int[num];
		
		for(int i = 0; i < num; i++) {
			A[i] = in.nextInt();
		}
		
		no.buble(A);
		
		
	}
}
