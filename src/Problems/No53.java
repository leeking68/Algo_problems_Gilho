package Problems;
//���� �˰��� 2597�� 
import java.util.Scanner;

public class No53 {

	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		
		int i, n=in.nextInt(), d[][] = new int[n+1][2], a[] = new int[n+1];
		
		for(i=1;i<=n;i++) {
			
			a[i] = in.nextInt();
	
		}
		
		d[1][0] = d[1][1] = a[1];
		
		for(i=2;i<=n;i++){
			d[i][0] = d[i-1][1]+a[i];
			d[i][1] = Math.max(d[i-2][0], d[i-2][1]) + a[i];
		}
		
		System.out.println(Math.max(d[n][0], d[n][1]));
		
		in.close();
		
	}
}
