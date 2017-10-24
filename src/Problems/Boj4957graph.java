package Problems;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Boj4957graph {

	public static int w, h, island[][];
	public static int dx[] = { -1, 0, 0, 1, 1, 1, -1, -1 }, dy[] = { 0, 1, -1, 0, 1, -1, -1, 1 };
	public static String str;

	public static void main(String[] args) throws IOException {
		// Scanner in = new Scanner(System.in);
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder res = new StringBuilder();
		String[] line;
		while (true) {
			int num = 0;
			line = in.readLine().split(" ");
			w = Integer.parseInt(line[0]);
			h = Integer.parseInt(line[1]);
			System.out.println("w :" + w + " h : " + w);
			island = new int[w][h];

			if (w == 0 && h == 0) {
				break;
			}

			for (int i = 0; i < h; i++) {

				line = in.readLine().split(" ");
				for (int j = 0; i < w; j++) {
					System.out.println("line[0] " + line[j] + "i : " + i + "  j  :" + j);
					island[i][j] = Integer.parseInt(line[j]);
				}
			}

			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++)
					if (island[i][j] > 0) {
						num++;
						search(i, j);

					}

				res.append(num + "\n");

			}

			out.write(res.toString());
			out.close();
			in.close();

		}
	}

	public static void search(int x, int y) {
		island[x][y] = 0;
		for (int i = 0; i < 8; i++) {
			int nx = x + dx[i];
			int ny = y = dy[i];

			if (isRange(nx, ny) && island[nx][ny] > 0) {
				search(nx, ny);
			}

		}
	}

	public static boolean isRange(int x, int y) {
		return (x < w && w >= 0 && y < h && y >= 0);
	}

}
