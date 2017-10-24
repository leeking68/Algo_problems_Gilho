package Problems;
//백준 2133 타일 채우기 

import java.util.Scanner;

public class Boj2133 {

	public static int n,d[];
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		d = new int[n+1];
		
		d[0] = 1;
				
		for(int i = 2; i < n+1; i++) {
			if(i%2==1) {
				continue;
			}
			
			d[i] = d[i-2]*3;
			System.out.println(d[i] + " i :" + i);
			for(int j = 4; i-j>=0; j++) {
				d[i] += d[i-j]*2;
				System.out.println(d[i] + " i :" + i);

			}
		}
		
		System.out.print(d[n]+ " :  " + n);
		
		
	}

}
