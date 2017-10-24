package Problems;

import java.io.IOException;
import java.util.Scanner;

public class No74_1 {

	public static void main(String args[]) throws IOException {

		Scanner in = new Scanner(System.in);

		int rslt = 0;

		// computer n
		int N = in.nextInt();
		// edge n
		int M = in.nextInt();

		int[][] map = new int[N + 1][N + 1];

		for (int i = 0; i < M; i++) {
			int s = in.nextInt();
			int e = in.nextInt();
			int c = in.nextInt();

			map[s][e] = map[e][s] = c;
		}

		// passed computer
		int[] key = new int[N];
		key[0] = 1; //시작점 

		int keyCnt = 1;
		
		while (keyCnt < N) {
			
			int min = Integer.MAX_VALUE;
			
			int minComputerFrom = 0;
			
			int minComputerTo = 0;
			
			for (int i = 0; i < keyCnt; i++) {
				for (int j = 1; j <= N; j++) {
					if (map[key[i]][j] < min && map[key[i]][j] != 0) {
						System.out.println(i+","+j+"ㅇ"+map[key[i]][j]+"|||key["+i+"]"+key[i]+"keyCnt"+keyCnt);
						boolean isCycle = false;
						
						System.out.println("브레이크 " + keyCnt + "||" + j);
						for (int k = 0; k < keyCnt; k++) {
							if (key[k] == j) {
								System.out.println(i+"key["+k+"]:"+key[k]+ ","+"j :"+j);
								isCycle = true;
								map[key[i]][j] = 0;
								map[j][key[i]] = 0;
								break;
							}
						}

						if (!isCycle) {
							min = map[key[i]][j];
							minComputerFrom = key[i];
							minComputerTo = j;
							System.out.println("from: "+key[0]+"to: "+j);
						}
					}
				}
			}
			key[keyCnt] = minComputerTo;
			keyCnt++;
			rslt = rslt + min;
		}

		System.out.println(rslt);

	}
}
