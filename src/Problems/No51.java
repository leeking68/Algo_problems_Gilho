package Problems;
import java.util.Scanner;

//문제
//n개의 정수로 이루어진 임의의 수열이 주어진다. 우리는 이 중 연속된 몇 개의 숫자를 선택해서 구할 수 있는 합 중 가장 큰 합을 구하려고 한다. 단, 숫자는 한 개 이상 선택해야 한다.
//
//예를 들어서 10, -4, 3, 1, 5, 6, -35, 12, 21, -1 이라는 수열이 주어졌다고 하자. 여기서 정답은 12+21인 33이 정답이 된다.
//
//입력
//첫째 줄에 정수 n(1≤n≤100,000)이 주어지고 둘째 줄에는 n개의 정수로 이루어진 수열이 주어진다. 수는 -1,000보다 크거나 같고, 1,000보다 작거나 같은 정수이다.
//
//출력
//첫째 줄에 답을 출력한다.
//
//예제 입력  복사
//10
//10 -4 3 1 5 6 -35 12 21 -1
//예제 출력  복사
//33

public class No51 {

	public int numCal(int A[], int temp[]) {
		temp[0] = A[0];
		int max = temp[0];
		// 현재와 현재+직전 부분합 비교
		for (int i = 1; i < A.length; i++) {
			temp[i] = Math.max(A[i], A[i] + temp[i - 1]);
			max = Math.max(max, temp[i]);
		}
		return max;

	}

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		No51 no = new No51();

		int n = in.nextInt();

		int A[] = new int[n];
		int temp[] = new int[n];

		for (int i = 0; i < n; i++) {
			A[i] = in.nextInt();
		}
		
		System.out.println("최대합: " + no.numCal(A, temp));

	}
}
