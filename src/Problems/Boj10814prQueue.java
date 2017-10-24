package Problems;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.PriorityQueue;
import java.util.Comparator;
public class Boj10814prQueue {
	
	static class Member{
		int age;
		String name;
		int uid;
		Member(int age, String name, int uid) {
			this.age=age;
			this.name=name;
			this.uid = uid;
		}
	}
	public static int n;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		PriorityQueue<Member> pq = new PriorityQueue<Member>(100000, new Comparator<Member>(){
			@Override
			public int compare(Member m1, Member m2) {
				if(m1.age < m2.age) {
					System.out.println(m1.age+"<-m1     //// "+m2.age );
					return -1;
				} else if (m1.age > m2.age) {
					return 1;
				} else {
					return m1.uid - m2.uid;
				}
			}
			
		});
		n = in.nextInt();
		String[] name = new String[n];
		int[] age = new int[n];
		for(int i = 0; i < n; i++) {
			String[] st = in.nextLine().split(" ");
			age[i] = Integer.parseInt(st[0]);
			name[i] = st[1];
		}
		
		for(int i = 0; i < n; i++) {

			pq.add(new Member(age[i], name[i],i));
		}
		
		while(!pq.isEmpty()) {
			Member m = pq.poll();
			
			System.out.println(m.age+ " " + m.name);
		}
		
		in.close();
		
	}

}
