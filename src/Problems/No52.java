package Problems;
//트리에서 리프 노드란, 자식의 개수가 0인 노드를 말한다.
//
//트리가 주어졌을 때, 노드 중 하나를 제거할 것이다. 그 때, 남은 트리에서 리프 노드의 개수를 구하는 프로그램을 작성하시오.
//
//예를 들어, 다음과 같은 트리가 있다고 하자.
//
//
//
//현재 리프 노드의 개수는 3개이다. (초록색 색칠된 노드) 이 때, 1번을 제거한다고 하면, 다음과 같이 된다.
//
//
//
//이제 리프 노드의 개수는 1개이다.
//
//입력
//첫째 줄에 트리의 노드의 개수 N이 주어진다. N은 50보다 작거나 같은 자연수이다. 둘째 줄에는 0번 노드부터 N-1번 노드까지, 각 노드의 부모가 주어진다. 만약 부모가 없다면 (루트) -1이 주어진다. 셋째 줄에는 지울 노드의 번호가 주어진다.
//
//출력
//첫째 줄에 입력으로 주어진 트리에서 입력으로 주어진 노드를 지웠을 때, 리프 노드의 개수를 출력한다.
//
//예제 입력  복사
//5
//-1 0 0 1 1
//2
//예제 출력  복사
//2
import java.util.Scanner;


public class No52 {

	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int A[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			A[i] = in.nextInt();
		}
		
		int del = in.nextInt();
		A[del] = -1;
		
		for(int i = 0; i < n; i++) {
			if(del = A[i]) {
				A[i]
			}
		} 
		
	}
}