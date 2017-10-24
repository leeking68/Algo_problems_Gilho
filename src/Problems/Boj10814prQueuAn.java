package Problems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Boj10814prQueuAn {
	static class Member {
		int uid;
		int age;
		String name;

		Member(int uid, int age, String name) {
			this.uid = uid;
			this.age = age;
			this.name = name;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Member> q = new PriorityQueue<Member>(100000, new Comparator<Member>() {
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
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			System.out.println(i+"iii");
			q.add(new Member(i, Integer.parseInt(st.nextToken()), st.nextToken()));
		}
		while (!q.isEmpty()) {
			Member m = q.poll();
			System.out.println(m.age + " " + m.name);
		}
	}
}
