package Problems;
//boj 1965 상자 넣기 dp 

import java.util.Scanner;
public class Boj1965dp {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int i,j,n=in.nextInt(),max=0;
		int d[] = new int[1001];
		int a[] = new int[1001];
		
		for(i = 0; i <n; i++) a[i] = in.nextInt();
			
		for(i= 0; i< n; i++) {
			d[i] = 1;
			for(j = 1; j <i; j++ ) {
				if(a[j]<a[i]&&d[i] < d[j]+1)
					d[i] = d[j]+1;
				if(max<d[i]) 
					max = d[i];
			}
		
		}
		
		System.out.print(max);
		in.close();
	}
}
