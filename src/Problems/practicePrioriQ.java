package Problems;

import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Comparator;

public class practicePrioriQ {

	static class Member {

		int x, y, w;

		public Member(int x, int y, int w) {
			this.x = x;
			this.y = y;
			this.w = w;
		}
	}

	static class Alpha {
		char x;
		int y;

		public Alpha(char x, int y) {
			this.x = x;
			this.y = y;
		}

	}

	static class Chart {
		char name;
		int age;
		int birth;

		public Chart(char name, int age, int birth) {
			this.name = name;
			this.age = age;
			this.birth = birth;
		}
	}

	public static void main(String args[]) {

		PriorityQueue<Member> pq = new PriorityQueue<Member>(new Comparator<Member>() {
			@Override
			public int compare(Member m1, Member m2) {
				if (m1.x < m2.x) {
					return -1;

				} else if (m1.x > m2.x) {
					return 1;
				} else {
					System.out.println(m1.y + " : " + m2.y);
					return m1.y - m2.y;

				}
			}

		});

		pq.offer(new Member(1, 2, 3));
		pq.offer(new Member(2, 1, 3));
		pq.offer(new Member(3, 2, 2));

		while (!pq.isEmpty()) {
			System.out.println(pq.peek().x + " : " + pq.peek().y + "  :  " + pq.poll().y);
		}

		PriorityQueue<Alpha> pqq = new PriorityQueue<Alpha>(new Comparator<Alpha>() {

			@Override
			public int compare(Alpha a, Alpha a2) {

				if (a.x < a2.x) {
					return -1;
				} else if (a.x > a2.x) {
					return 1;
				}
				return 0;
			}

		});

		pqq.offer(new Alpha('C', 10));
		pqq.offer(new Alpha('B', 12));
		pqq.offer(new Alpha('A', 15));
		while (!pqq.isEmpty()) {
			int x = pqq.peek().x;
			int y = pqq.poll().y;

			System.out.println("'" + x + "'" + y);

		}

		PriorityQueue<Chart> pc = new PriorityQueue<Chart>(new Comparator<Chart>() {

			@Override
			public int compare(Chart c1, Chart c2) {

				if (c1.name < c2.name) {
					return -1;
				} else if (c1.name == c2.name) {
					if (c1.age < c2.age) {
						return -1;
					} else if (c1.age == c2.age) {
						if (c1.birth < c2.birth) {
							return -1;
						}
					}

				} else if (c1.age < c2.age) {
					System.out.println(c1.age + " : " + c2.age);
					return -1;
				} else if (c1.birth < c2.birth) {
					return -1;
				}
				;

				return 0;

			}
		});

		pc.offer(new Chart('김', 20, 7));
		pc.offer(new Chart('님', 20, 7));
		pc.offer(new Chart('딤', 20, 7));
		pc.offer(new Chart('김', 19, 7));
		pc.offer(new Chart('김', 20, 6));

		while (!pc.isEmpty()) {

			System.out.println(String.valueOf(pc.peek().name) + pc.peek().age + pc.poll().birth);
		}

	}

}
