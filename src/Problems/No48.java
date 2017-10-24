package Problems;
//이진탐색 
import java.util.Scanner;

public class No48 {
	static int[] A = {1,3,5,7,9};
	
	
	public int binarySer(int n) {
		int num = 0;
		int low = 0;
		int high = A.length-1;
		double mid = (low + A.length)/2;
		while(low<=high) {
			System.out.println("aa"+n);
			num++;
			
			if(A[(int) mid]==n) {
				break;
			}
			
			if(mid > n) {
				low = (int) (mid + 1);
			} else if (n > mid) {
				high = (int) (mid - 1);
			}
			
			mid =Math.floor((low + high)/2);
			
			
		}
		
		return num;
	}
	
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		
		No48 no = new No48();
		
		int n = in.nextInt();
		
		int cnt = no.binarySer(n);
		
		System.out.println(cnt);
		
	}
	
}
