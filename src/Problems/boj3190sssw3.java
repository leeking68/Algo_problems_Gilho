package Problems;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//백준 뱀 문제 3 

public class boj3190sssw3 {

	public static final int SNAKE = 2;
	public static final int APPLE = 1;
	public static final int BLANK = 0;

	public static final int RIGHT = 0;

	public static final int[] dRow = { 0, 1, -1, 0 }, dCol = { 1, 0, 0, -1 };

	public static int N, K, curDir, row, col, headRow = 1, headCol = 1, tailRow = 1, tailCol = 1, step = 0;

	public static int[][] map = new int[102][102];
	public static int[][] direction = new int[102][102];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		N = Integer.parseInt(br.readLine());
		K = Integer.parseInt(br.readLine());


		for (int i = 0; i < K; i++) {
			StringTokenizer stk = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(stk.nextToken());
			int c = Integer.parseInt(stk.nextToken());
			map[r][c] = APPLE;
		}

		int L = Integer.parseInt(br.readLine());
		snakeMove[] snL = new snakeMove[L + 1];
		for (int i = 0; i < L; i++) {
			StringTokenizer stk = new StringTokenizer(br.readLine());
			snL[i] = new snakeMove(Integer.parseInt(stk.nextToken()), stk.nextToken().charAt(0));
		}
		
		 snL[L] = new snakeMove(100, 'D');


		
		// 초기 위치를 설정해야된다.
		curDir = RIGHT;
		map[headRow][headCol] = SNAKE;
		direction[headRow][headCol] = curDir;

		boolean ret = false;

		for (int i = 0; i < L + 1 && !ret; i++) {
			int how = snL[i].x;
			char dir = snL[i].y;
			if(i>0) how = snL[i].x - snL[i-1].x;
			
			while (how-- > 0) {
				step++;

				direction[headRow][headCol] = curDir;

				headRow += dRow[curDir];
				headCol += dCol[curDir];

				if (map[headRow][headCol] == SNAKE) {
					System.out.println(step);
					ret = true;
					break;
				}

				if (map[headRow][headCol] == APPLE) {
					map[headRow][headCol] = SNAKE;
					direction[headRow][headCol] = curDir;

				}

				if (map[headRow][headCol] == BLANK) {
					map[headRow][headCol] = SNAKE;
					map[tailRow][tailCol] = BLANK;
					direction[headRow][headCol] = curDir;

					tailRow += dRow[curDir];
					tailCol += dCol[curDir];
				}

				if (headRow > N || headRow < 0 || headCol > N || headCol < 0) {
					System.out.println(step);
					ret = true;
					break;
				}

			}
			
			if(dir=='L') {
				curDir = (curDir -1+4)%4;
			} else if(dir=='D') {
				curDir = (curDir+1)%4;
			}

		}
	}

}

class snakeMove {
	int x;
	char y;

	public snakeMove(int x, char y) {
		this.x = x;
		this.y = y;
	}
}
