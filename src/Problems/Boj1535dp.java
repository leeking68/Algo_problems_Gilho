package Problems;

//백준 1535 안녕 dp 

import java.util.Scanner;

public class Boj1535dp {

	public static int n, arrLife[], arrHappy[], lifeD[], happyD[];

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		arrLife = new int [20];
		arrHappy = new int[20];
		lifeD = new int[20];
		happyD = new int[20];
		
		for(int i = 1; i <= n; i++) {
			lifeD[i] = arrLife[i] = in.nextInt();
		}
		for(int i = 1; i <= n; i ++) {
			happyD[i] = arrHappy[i] = in.nextInt();
		}
		
		hiDp();
		
		System.out.println(happyD[n]);
		
	}

	public static void hiDp() {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (lifeD[j] + arrLife[i] < 100 && happyD[i] < happyD[j] + arrHappy[i]) {
					happyD[i] = happyD[j] + arrHappy[i];
					lifeD[i] = lifeD[j] + arrLife[i];
				}
			}
		}

	}

}
