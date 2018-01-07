package Problems;

/**
 * 
 *
 * 백준 1181 단어정
 * 
 * 문자
 * 
 *
 */
import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Comparator;

public class boj1181string {

	public static int n;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();

		PriorityQueue<StringArr> pq = new PriorityQueue<StringArr>(new Comparator<StringArr>() {
  
			@Override
			public int compare(StringArr st1, StringArr st2) {

				if (st1.num < st2.num) {
					return -1;
				} else if (st1.num == st2.num) {
					String str1 = st1.str;
					String str2 = st2.str;
					int str1leng = str1.length();
					int str2leng = str2.length();
					int size = 0;
					if(str1leng < str2leng) {
						size = str1leng;
					} else {
						size = str2leng;
					}
					
					for(int i = 0; i < size; i++) {
						
						if(str1.charAt(i) < str2.charAt(i)) {
							return -1;
						} else if (str1.charAt(i)> str2.charAt(i)) {
							return 1;
						}
						
					}
					return 0;
					
				} else {
					return 1;
				}
			}
		});
		
		for(int i = 0; i <n; i++) {
			String str = in.next();
			
			pq.offer(new StringArr(str,str.length()));
		}
		
		for(int i = 0; i < pq.size(); i++) {
			System.out.println(pq);
		}

	}

	static class StringArr {
		String str;
		int num;

		public StringArr(String str, int num) {
			this.str = str;
			this.num = num;

		}
	}

}
