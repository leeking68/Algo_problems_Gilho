package Problems;

//10814 나이 순 정렬

import java.io.BufferedReader;
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Comparator;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj10814strSort {

	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		PriorityQueue<Member> pq = new PriorityQueue<Member>(100000, new Comparator<Member>() {
			@Override
			public int compare(Member m1, Member m2) {
				if (m1.age < m2.age) {
					return -1;
				} else if (m1.age > m2.age) {
					return 1;
				} else {
					return m1.uid - m2.uid;
				}
			}
		});
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			StringTokenizer stk = new StringTokenizer(br.readLine());
			System.out.println("stk" + stk);
			pq.add(new Member(i,Integer.parseInt(stk.nextToken()),stk.nextToken()));
		}
		
		while(!pq.isEmpty()) {
			Member m = pq.poll();
			System.out.println(m.age + "aa" + m.name);
			System.out.println(m.age+ "" + m.name);
		}

	}

	static class Member {
		int uid;
		int age;
		String name;

		Member(int uid, int age, String name) {
			this.uid = uid;

		}
	}

}