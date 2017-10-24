package Problems;
import java.util.Scanner;

public class SSsw04 {
	
	public int up(int N, int M, int A[][], int rN,int rM,int bN,int bM,int oN,int oM) {
		
		if(A[rN+1][rM] == 'O') {
			return 1;
		}
		
		for(int i = rN; i < N; i++) {
			for(int j = rM; j < M; j++) {
				
				if(A[i+1][j]=='#' && A[i+1][j] == 'B') {
					return 2;
				}
				
				A[i+1][j] = 'R';
				
			}
			
		}

		for(int i = bN; i < N; i++) {
			for(int j = bM; j < M; j++) {
				
				if(A[i+1][j]=='#' && A[i+1][j] == 'R') {
					return 2;
				}
				

				A[i+1][j] = 'B';
				
			}
		}
		
		return 3;
		
	}
	
	public int down(int N, int M, int A[][], int rN,int rM,int bN,int bM,int oN,int oM ) {
		
		if(A[rN-1][rM] == 'O') {
			return 1;
		}
		
		for(int i = rN; i < N; i++) {
			for(int j = rM; j < M; j++) {
				
				
				
				if(A[i-1][j]=='#' && A[i-1][j] == 'B') {
					return 2;
				}
				
				A[i-1][j] = 'R';
				
			}
			
		}

		for(int i = bN; i < N; i++) {
			for(int j = bM; j < M; j++) {
				
				if(A[i-1][j]=='#' && A[i-1][j] == 'R') {
					return 2;
				}
				

				A[i-1][j] = 'R';
				
			}
		}
			return 3;
	}
	
	public int right(int N, int M, int A[][], int rN,int rM,int bN,int bM,int oN,int oM) {
		
		if(A[rN][rM+1] == 'O') {
			return 1;
		}
		
		for(int j = rN; j < N; j++) {
			for(int i = rM; i < M; i++) {
				
				
				
				if(A[i][j+1]=='#' && A[i][j+1] == 'B') {
					return 2;
				}
				
				A[i][j+1] = 'R';
				
			}
			
		}

		for(int j = bN; j < N; j++) {
			for(int i = bM; i < M; i++) {
				
				if(A[i][j+1]=='#' && A[i][j+1] == 'R') {
					return 2;
				}
				
				A[i][j+1] = 'B';
				
				
			}
			
		}
		return 3;
	}
	
	public int left(int N, int M, int A[][], int rN,int rM,int bN,int bM,int oN,int oM) {
		
		if(A[rN][rM-1] == 'O') {
			return 1;
		}
		
		for(int j = rN; j < N; j++) {
			for(int i = rM; i < M; i++) {
				
				
				
				if(A[i][j-1]=='#' && A[i][j-1] == 'B') {
					return 2;

				}
				
				A[i][j+1] = 'R';
				
			}
			
		}

		for(int j = bN; j < N; j++) {
			for(int i = bM; i < M; i++) {
				
				if(A[i][j-1]=='#' && A[i][j-1] == 'R') {
					
					return 2;
				}
				
				A[i][j-1] = 'B';
				
				
			}
		}
		
				return 3;
		
	}
	
	
	public static void main(String args[]) {
		
		SSsw04 ss = new SSsw04();
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("���� ������ ũ�� �Է��Ͻÿ�");
		int N = in.nextInt();
		System.out.println("���� ������ ũ�� �Է��Ͻÿ�");
		int M = in.nextInt();
		
		int A[][] = new int[N][M];
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				System.out.println(i+","+j+"��°�Է�");
				A[i][j] = in.nextInt();
			}
		}
		
		int rN,rM,bN,bM,oN,oM;
		int count;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				if(A[i][j]=='R') {
					rN = i;
					rM = j;
				}
				
				if(A[i][j]=='B') {
					bN = i;
					bM = j;
				}
				
				if(A[i][j]=='O') {
					oN = i;
					oM = j;
				}
				
			}
		}
		
		while()
	
		
		
		
		
	}
}
