package Problems;
/**
 * 
 *
 * 백준 1344 축구 
 * 
 * 동적계획
 *
 */

//홍준이는 축구 경기를 보고 있다. 
//그러다가 홍준이는 역시 두 팀 중 적어도 한 팀이 골을 소수로 득점할 확률이 궁금해 졌다. 
//축구 경기는 90분동안 이루어지고, 분석을 쉽게하기 위해서 경기를 5분 간격으로 나눴다. 처음 간격은 처음 5분이고, 
//두 번째 간격은 그 다음 5분, 그리고 이런식으로 나눈다. 경기가 진행되는 동안 각 간격에서 A팀이 득점할 확률과 B팀이 득점할 확률이 주어진다. 
//그리고, 각 간격에서 두 팀은 각각 많아야 한 골을 득점할 수 있다. 경기가 끝난 후 적어도 한 팀이 골을 소수로 득점할 확률을 구하시오.

// 골을 소수로 넣어야한다. 
// 시간은 90분 , 5분간격으로 나눈다. 
// A,B의 확률이 주어진다. 
// 5분동안 최대 한골  --> 0<= <=1
// 적어도 한 팀이 골을 소수로 득점할 확률 --> 1 - 둘다 소수로 득점하지 않을 확률 
// 확률은 --> 0<= <=100

import java.util.Scanner;

public class boj1344dp {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double pa = in.nextInt();
		double pb = in.nextInt();
		double[][][] d = new double[20][20][20];
		pa /= 100.0;
		pb /= 100.0;
		d[0][0][0] = 1.0;

		for (int i = 1; i <= 90 / 5; i++) {
			for (int j = 0; j <= i; j++) {
				for (int k = 0; k <= i; k++) {
					if (j >= 1 && k >= 1) {
						d[i][j][k] += d[i - 1][j - 1][k - 1] * pa * pb;
						System.out.println(d[i][j][k]);
					}
					if (j >= 1) {
						d[i][j][k] += d[i - 1][j - 1][k] * pa * (1 - pb);
					}
					if (k >= 1) {
						d[i][j][k] += d[i - 1][j][k - 1] * (1 - pa) * pb;
					}
					d[i][j][k] += d[i - 1][j][k] * (1 - pa) * (1 - pb);
				}
			}
		}
		
		double ans = 0.0;
		
		for(int i = 0; i <= 90/5; i++) {
			for(int j = 0; j <= 90/5; j++) {
				if(prime(i)||prime(j)) {
					ans += d[90/5][i][j];

				}
			}
		}
		
		System.out.println(ans);

	}
	
	public static boolean prime(int i) {
		if(i <= 1) return false;
		if(i == 2) return true;
		
		for(int j = 2; j*j < i; j++) {
			if(i%j==0) {
				return false;
			}
		}
		
		return true;
	}

}
