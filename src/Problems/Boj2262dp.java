package Problems;
/**
 * 
 *
 * 백준 2262 토너먼트 만들기
 * 
 * 동적계획법
 *
 */
import java.util.Scanner;
public class Boj2262dp {
	
	public static int n,arr[],w[][],d[][];
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		arr = new int[256];
		w = new int[256][256];
		d = new int[256][256];
		
		for(int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			
			w[i][i] = arr[i];
			
			for(int j = i+1; j < n; j++) {
				w[i][j] = Math.min(w[i][j-1], arr[j]);
			}
		}
		
		System.out.println(solution(0,n-1));
	}
	
	
	public static int solution(int i, int j) {
		if(d[i][j]!=0) return d[i][j];
		if(i==j) return 0;
		d[i][j] = 200000000;
		
		for(int k = i; k < j; k++) {
			int temp = solution(i,k) + solution(k+1,j);
			temp += Math.abs(w[i][k]-w[k+1][j]);
			
			if(d[i][j] > temp) {
				d[i][j] = temp;
			}
			
		}
		
		return d[i][j];
		
	}

}
