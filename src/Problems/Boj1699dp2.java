package Problems;

/**
 * 
 * 백준 1699 제곱수의 합
 * 
 * 풀이법 : 동적계획
 * 
 */

import java.util.Scanner;
public class Boj1699dp2 {
	public static int n,arr[];
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		arr = new int[n+1];
		
		for(int i = 1; i <n+1; i++) {
			arr[i] = i;
			for(int j = 1; j*j<i; j++) {
				
				if(arr[i] > arr[i-j*j]+1) {
					arr[i] = arr[i-j*j]+1;
				}
				
			}
		}
		
		System.out.println(arr[n]);
	}

}
