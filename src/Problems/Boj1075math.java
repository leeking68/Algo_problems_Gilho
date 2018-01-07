package Problems;
/**
 * 
 *
 * 백준 1075 동적계획법 
 * 
 *
 */
import java.util.Scanner;
public class Boj1075math {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String n = in.next();
		int f = in.nextInt();
		int numLength = n.length()-1;
		int number = 1;
		for(int i = 1; i <=numLength; i++) {
			number *=10;
		}
		
		int result = 0;
		
		for(int i = 1; i <=100; i++) {
			
			
			if(number%f==0) {

				break;
			}
			
			number++;
			result++;
			
		}
		
		
		if(result < 10) {
			n = "0" + String.valueOf(result);
			System.out.println(n);
		} else {
			System.out.println(result);
		}
	}

}
