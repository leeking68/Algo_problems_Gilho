package Problems;

//숫자 삼각형 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Boj1932dpdpdp {
	public static int n, t[][], dp[][];

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		n = in.nextInt();
		t = new int[n][n];
		dp = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer stk = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				t[i][j] = Integer.parseInt(stk.nextToken());
				System.out.println(t[i][j]);
			}
		}
		
	}

}
