package Problems;

//백준 1302 문자열 조작 ( 형변환 많음 )  

import java.util.Scanner;

public class Boj1302LcsString {

	public static int n;
	public static String line = "";
	public static String x[];

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		x = new String[n];

		for (int i = 0; i < n; i++) {
			x[i] = in.nextLine();
		}

		System.out.println(stringCheck());

	}

	public static String stringCheck() {
		int leng = x[0].length();
		boolean check = false;
		for (int i = 0; i < leng; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (x[j].charAt(i) != x[j + 1].charAt(i)) {
					check = true;
					break;

				}
			}

			if (check) {
				line += "?";
			} else {
				line += Character.toString(x[0].charAt(i));
			}

		}
		return line;
	}

}
