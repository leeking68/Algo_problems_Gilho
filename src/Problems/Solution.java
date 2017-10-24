package Problems;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Solution {

	static int n, m, many, cnt, picture[][], dx[] = { -1, 1, 0, 0 }, dy[] = { 0, 0, -1, 1 };

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		n = in.nextInt();
		m = in.nextInt();

		picture = new int[m][n];
		in.close();
		solution(m, n, picture);
	}

	public static int[] solution(int m, int n, int[][] picture) {
		int numberOfArea = 0;
		int maxSizeOfOneArea = 0;

		maxSizeOfOneArea = flood(0, 0);
		numberOfArea = cnt;
		int[] answer = new int[2];
		answer[0] = numberOfArea;
		answer[1] = maxSizeOfOneArea;
		return answer;
	}

	public static int flood(int start, int end) {
		Queue<Node> q = new LinkedList<>();
		q.add(new Node(start, end));
		cnt = 1;
		many = 1;
		int min = -1;
		while (q.isEmpty()) {
			Node n = q.poll();
			for (int i = 0; i < 4; i++) {
				int nx = n.x + dx[i];
				int ny = n.y + dy[i];
				if (isRange(nx, ny)) {
					if (picture[n.x][n.y] != picture[nx][ny]) {
						cnt++;
						if (min < many) {
							min = many;
						}
						many = 1;
						flood(nx, ny);
					} else if (picture[n.x][n.y] == picture[nx][ny]) {
						many++;
						q.add(new Node(nx, ny));
					}

				}
			}
		}
		
		return min;
	}

	public static boolean isRange(int x, int y) {
		return (x < m && x >= 0 && y < n && y >= 0);
	}
	

static class  Node {
	int x;
	int y;

	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

}
