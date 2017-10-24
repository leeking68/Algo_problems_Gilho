package Problems;
//11726 dp  2Xn 타일링 
import java.util.Scanner;
public class Boj11726dpdp2 {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int[] d = new int[n];
		
		System.out.println(fibo(n,d));
		
		
	}
	public static int fibo(int n, int d[]) {
	
		d[0] = 1;
		d[1] = 2;
		
		for(int i = 2; i < n; i++) {
			d[i] = d[i-2] + d[i-1];
		}
		
		return d[n-1]%10007;
	}
}
