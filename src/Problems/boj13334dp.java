package Problems;

// 백준 13334철로dp pq 
import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Comparator;

public class boj13334dp {

	public static int n, h, o, d[], line;

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		
		PriorityQueue<Elements> pq = new PriorityQueue(new Comparator<Elements>() {
			public int compare(Elements o1, Elements o2) {
				return Integer.compare(o1.x, o2.x);
			}

		});

		for (int i = 0; i < n; i++) {
			o = in.nextInt();
			h = in.nextInt();

			pq.offer(new Elements(o));
			pq.offer(new Elements(h));

		}
		
		line = in.nextInt();
		int shut = 1; 
		int max = 1;
		while(shut!=1) {
			
			int x = pq.poll().x;
			max ++;
			int y = x + (line-1);
			while(x < y || x == y) {
				
				x = pq.peek().x;
				
				max++;
				
			}
			
			if(x >= line) {
				shut = -1;
			}
			
		}
		
		System.out.println(max);
		
		
		in.close();
	}

	static class Elements {
		int x;

		public Elements(int x) {
			this.x = x;
		}
	}
}
