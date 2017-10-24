package Problems;

// cominc no 80 http://blog.naver.com/PostList.nhn?from=postList&blogId=occidere&categoryNo=43&currentPage=2

import java.awt.Point;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Comparator;

public class comicNo80 {

	static int N, INF = 9999999;
	static int map[][];
	static int dist[];

	public static int dij(int start, int end) {
		int nowNode, nowWeight, nextNode;

		dist = new int[N + 1];
		for (int i = 0; i < N + 1; i++)
			dist[i] = INF;

		PriorityQueue<Integer> StartTo = new PriorityQueue<>();

		PriorityQueue<Point> pq = new PriorityQueue<>(new Comparator<Point>() {
			public int compare(Point a, Point b) {
				return Integer.compare(a.y, b.y);
			}
		});

		pq.offer(new Point(start, dist[start] = 0));

		while (!pq.isEmpty()) {
			nowNode = pq.peek().x;
			nowWeight = pq.poll().y;

			for (nextNode = 1; nextNode <= N; nextNode++) {
				if (map[nowNode][nextNode] != 0 && dist[nextNode] > nowWeight + map[nowNode][nextNode]) {
					dist[nextNode] = map[nowNode][nextNode] + nowWeight;
					pq.offer(new Point(nextNode, dist[nextNode]));
					if (nextNode == end) {
						StartTo.add(dist[nextNode]);
					}
				}
			}
		}
		StartTo.poll();
		return StartTo.poll();

	}

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		int M = in.nextInt();

		map = new int[N + 1][N + 1];

		for (int i = 0; i < M; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int weight = in.nextInt();
			map[a][b] = map[b][a] = weight;
		}

		int start = in.nextInt();
		int end = in.nextInt();

		System.out.print(dij(start, end));

	}
}
