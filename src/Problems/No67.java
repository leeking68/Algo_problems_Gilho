package Problems;
//���� 1238�� �÷��̵� 

import java.util.Scanner;	

public class No67 {
	
	public static void main(String args[]) {
	
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();//���̵���
		int m = in.nextInt();//����
		int x = in.nextInt();//����
		int inf = 1000000;
		
		int arr[][] = new int[n+1][n+1];
		
		for(int i = 0; i < n+1; i++) {
			for(int j = 0; j < n+1; j++) {
				arr[i][j] = inf;
			}
		}
		
		for(int i = 1; i < m+1; i++) {
			
				int from = in.nextInt();
				int to = in.nextInt();
				int w = in.nextInt();
				
				arr[from][to] = w;
				System.out.println("aa"+i+"aa"+(m+1));
			
		}
		
		in.close();
		
		for(int k = 0; k < n+1; k++){
			for(int i = 0; i < n+1; i++) {
				for(int j = 0; j < n+1; j++) {
					if(i!=j&&arr[i][j]>arr[i][k]+arr[k][j]) {
						arr[i][j] = arr[i][k]+arr[k][j];
					}
				}
			}
		
		}
		
		int temp = -1;
		for(int k = 0; k < n+1; k++) {
			if(arr[k][x]!=inf&&arr[x][k]!=inf&&temp < arr[k][x] + arr[x][k]) {
				temp = arr[k][x] + arr[x][k];
			}
		}
		
		System.out.println(temp);
	}
	
}
