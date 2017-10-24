package Problems;

//Boj 1157 단어공 
import java.util.Arrays;
import java.util.Scanner;

public class Boj1157string {

	public static int n;
	public static String str;
	public static String[] strArr;
	public static boolean[] visit;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[26];
		int[] arr1;
		
		str = in.nextLine();
		
		for(int i = 0; i < str.length(); i++) {
			int n = str.charAt(i);
			
			if(n < 97) {
				arr[n-65]++;
			} else {
				arr[n-97]++;
			}
		}
		
		arr1 = Arrays.copyOf(arr, 26);
		Arrays.sort(arr);
		if(arr[25]==arr[24]) {
			System.out.println("?");
		} else {
			for(int i = 0 ; i < 26; i++) {
				if(arr[25] == arr1[i]) {
					System.out.printf("%c",65+i);
				}
			}
		}

	}

}
