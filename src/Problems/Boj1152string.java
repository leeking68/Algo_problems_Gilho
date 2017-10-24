package Problems;

import java.util.Scanner;
import java.util.StringTokenizer;
public class Boj1152string {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String[] arr = str.split(" ");
		System.out.println(arr.length);
		StringTokenizer stk = new StringTokenizer(str);
		
		System.out.println(stk.countTokens());
		
	}
}

