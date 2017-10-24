package Problems;
//���� 1094
import java.util.Scanner;

public class No56 {

	public static int cnt; 
	
	public static int first(int x, int stick) {
		if(stick==x) cnt++;
		while(x>0){
			if(stick>x) {
				stick = stick/2;
			} else { 
				x = x - stick;
				cnt++;
			}
		}
		
		return cnt;
		
	}
	
	public static int second(int x, int stick) {
		while(true) {
			if(x==0) break;
			if(x%2==1) cnt++;
			x = x/2;
		}
		
		return cnt;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int stick = 64;
		
		cnt = first(x, stick);
		
		cnt=0;
		
		cnt = second(x, stick);
		
		System.out.println(cnt);
	}
	
}
