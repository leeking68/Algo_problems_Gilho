package Problems;
import java.util.Scanner;

//문제
//세준이는 N*N크기의 배열을 만들었다. (배열의 방 번호는 1부터 시작한다.)
//
//그 배열을 A라고 했을 때, 배열에 들어가는 수는 A[i][j] = i*j 이다.
//
//세준이는 이 수를 일차원 배열 B에 넣으려고 한다. 그렇게 되면, B의 크기는 N*N이 될 것이다. 그러고 난 후에, B를 정렬해서 k번째 원소를 구하려고 한다.
//
//N이 주어졌을 때, k번째 원소를 구하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 배열의 크기 N이 주어진다. N은 105보다 작거나 같은 자연수이다. 둘째 줄에 k가 주어진다. k는 min(109, n2)보다 작거나 같은 자연수이다.
//
//출력
//k번째 원소를 출력한다.
//
//예제 입력  복사
//3
//7
//예제 출력  복사
//6
public class No50 {
	
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		int k = in.nextInt();
		
		int num = N*N;
		
		int B[] = new int[num];
			B[0] = B[0];
		
		int A[][] = new int[N][N];
		
		for(int i = 0; i < N+1; i++) {
			for(int j = 0; j < N+1; j++) {
				A[i][j] = i*j;
				if(i*j>0) {
				B[A[i][j]] = A[i][j];
				}
			}
		}
		
		System.out.println(B[k]);
		
		
//		int low = 1;
//		int high = N*N;
//		int mid = (low+high)/2;
//		
//		while(low<=high) {
//			if(mid )
//		}
//		
	}

}
