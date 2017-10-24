package Problems;
// boj 2631 줄세우기 dp 
import java.util.Scanner;
public class Boj2631Lisdp {

	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int i,j, n = in.nextInt(), max = 0, a[] = new int[n+1], d[] = new int[n+1];
		
		for(i=1;i<=n;i++) a[i] = in.nextInt();
		
		for(i=1;i<=n;i++) {
			d[i] = 1;
			for(j=1;j<i;j++)
				if(a[j]<a[i]&&d[i]<d[j]+1) d[i]++;
			if(max < d[i]) max = d[i];
			
		}
		
		System.out.println(n-max);
		in.close();
	}
}
