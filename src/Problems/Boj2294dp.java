package Problems;
//no 91 동전2 dp 

import java.util.Scanner;

public class Boj2294dp {

	public static int n,k,arr[],d[];
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		k = in.nextInt();
		arr = new int[n+1];
		d = new int[k+1];
		
		for(int i = 1; i <=n; i++) {
			arr[i] = in.nextInt();
		}
		
		for(int i = 1; i <=k; i++) {	
			d[i] = 100001;
		}
		d[0] = 0;
		
		for(int i = 1; i <=n; i++) {
			for(int j = arr[i]; j<=k; j++) {
				d[j] = Math.min(d[j], d[j-arr[i]]+1);
			}
		}
		
		if(d[k]==100001) 
			d[k] = -1;
		
		System.out.println(d[k]);
		
		in.close();
		
	}
	
}
