package Problems;

// no 84 5557 1학년 DP

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Boj5557Dp {

	static int n;
	static int arr[];

	public static int cal() {
		int cnt = 0;
		Queue<Node> q = new LinkedList<Node>();
		q.add(new Node(arr[0],0));

		while (!q.isEmpty()) {
//			int x = q.peek().x;
			int weight = q.peek().y;
			q.poll();

			for (int i = 1; i < n-1; i++) {
				System.out.println("i :   "+i);
				if (weight + arr[i] <= 20) {
					if (i == n-2 && (weight + arr[i]) == arr[n - 1]) {
						cnt++;
					}
					
					q.add(new Node(arr[i],weight+ arr[i]));
				}
				if (weight - arr[i] > 0) {
					if (i == n-2 && (weight - arr[i]) == arr[n - 1]) {
						cnt++;
					}
					q.add(new Node(arr[i],weight - arr[i]));
				}
			}
		}

		return cnt;
	}

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		n = in.nextInt();
		arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}

		int count = cal();
		System.out.println(count);

	}
}

class Node {
	int x, y;

	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
