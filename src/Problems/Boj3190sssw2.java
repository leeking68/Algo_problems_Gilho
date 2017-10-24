package Problems;

// 백준 3190 뱀 삼성문제 다시풀기 
import java.util.Scanner;

public class Boj3190sssw2 {

	public static int n, k, row, col, l, map[][] = new int[102][102], dir[][] = new int[102][102];

	public static int APPLE = 1;
	public static int SNAKE = 2;
	public static int BLANK = 0;
	public static int INF = 100;

	public static int dx[] = { 0, 1, 0, -1 }, dy[] = { 1, 0, -1, 0 };

	// 현재 뱀의 머리 방
	public static int right = 3;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		k = in.nextInt();
		for (int i = 0; i < k; i++) {
			int r = in.nextInt();
			int c = in.nextInt();
			map[r][c] = APPLE;
		}

		int headR = 1, headC = 1;
		int tailR = 1, tailC = 1;
		int curDir = right;
		l = in.nextInt();
		Move[] info = new Move[l + 1];
		for (int i = 0; i < l; i++) {
			int time = in.nextInt();
			String dir = in.next();
			info[i] = new Move(time, dir.charAt(0));
		}

		info[l] = new Move(INF, 'D');

		map[headR][headC] = SNAKE;
		dir[headR][headC] = curDir;

		// 정답 도출
		int step = 0;
		boolean ret = false;// 계산도구

		for (int i = 0; i < l + 1; i++) {

			int X = info[i].time;
			char C = info[i].dir;

			int diff = X;
			if (i > 0)
				diff = info[i].time - info[i - 1].time;

			while (diff-- > 0) {
				step++;

				dir[headR][headC] = curDir;

				headR += dx[curDir];
				headC += dy[curDir];

				if (headR > n || headR < 1 || headC > n || headC < 1) {
					System.out.println(step);
					ret = true;
					break;
				}

				if (map[headR][headC] == BLANK) {
					map[headR][headC] = SNAKE;
					dir[headR][headC] = curDir;
					map[tailR][tailC] = BLANK;

					// 꼬리이동
					int tailDir = dir[tailR][tailC];
					tailR += dx[tailDir];
					tailC += dy[tailDir];
				}

				if (map[headR][headC] == APPLE) {
					map[headR][headC] = SNAKE;
					dir[headR][headC] = curDir;

				}

				else if (map[headR][headC] == SNAKE) {
					System.out.println(step);
					ret = true;
					break;
				}

			}

			curDir = C == 'L' ? (curDir - 1 + 4) % 4 : (curDir + 1) % 4;

		}

	}

}

class Move {
	int time;
	char dir;

	public Move(int time, char dir) {
		this.time = time;
		this.dir = dir;
	}
}
