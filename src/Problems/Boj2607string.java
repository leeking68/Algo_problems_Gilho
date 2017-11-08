package Problems;

/**
 * 
 * @author gil

 * 
 * 백준 2607 비슷한 단어 
 * 
 * 분류 : 문자열 처리 
 * 
 *
 */

import java.util.HashMap;
import java.util.Scanner;

public class Boj2607string {

	public static int N, cnt = 0;
	public static String strArr[];

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();

		String str = in.next();

		strArr = new String[N - 1];

		for (int i = 0; i < N - 1; i++) {
			strArr[i] = in.next();
		}

		for (int i = 0; i < N - 1; i++) {

			if (str.equals(strArr[i])) {
				cnt++;
			} else {
				HashMap<String, String> map = new HashMap<String, String>();

				char[] ch = strArr[i].toCharArray();
				char[] strCh = str.toCharArray();
				for (int j = 0; j < strArr[i].length(); j++) {
					map.put(String.valueOf(ch[j]), String.valueOf(ch[j]));
				}

				boolean check = false;
				int cntCheck = 0;
				
				if(Math.abs(str.length() - strArr[i].length()) > 1) {
					continue;
				}
				
				for (int k = 0; k < str.length(); k++) {
					String key = String.valueOf(strCh[k]);
					if (!map.containsKey(key)) {
						check = true;
						continue;
					} 
					
				}
				if (!check) {
					cnt++;
				}
			}

		}

		System.out.println(cnt);

	}

}
