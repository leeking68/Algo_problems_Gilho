package Problems;
//백준 11055 가장 큰 증가 부분 수열 LIS dp
import java.util.Scanner;
public class boj11055LisDp {
	
	public static void main(String arg[]){
		Scanner in = new Scanner(System.in);
		
		int i,j,n = in.nextInt(),max=0;
		int a[] = new int[1001];
		int d[] = new int[1001];
		
		for(i = 0; i < n; i++)
			a[i] = in.nextInt();
		
		for(i = 0; i < n; i++) {
			d[i] = a[i];
			for(j = 0; j < i; j++) {
				if(a[j]<a[i]&&d[i]<d[j]+a[i]) {
					d[i] = d[j]+a[i];
					
					if(max <d[i])
						max = d[i];
				}
			}
			
		
			
		}
		
		System.out.println(max);
		in.close();
			
		
	}

}
