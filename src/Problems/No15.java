package Problems;
import java.util.Scanner;

//���ϻ��� ����Ǯ��  BFS 
public class No15 {

	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		
		int n;
		n = in.nextInt();
		
		String [][] k = new String[n][n];
		
		int cntO = 1;
		int cntX = 1;
		
		//�׸���ȿ� ��ä���
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.println("(R,G,B)�� ����  ��� �Է��Ͻÿ� ");
				k[i][j] = in.next();
				
				if("k[i][j]".equals("R")||"k[i][j]".equals("G")||"k[i][j]".equals("B")) {
					k[i][j] = k[i][j];
				} else {
					System.out.println("�ٽ� �Է��Ͻÿ� :");
					k[i][j] = in.next();
				}
				
			}
		}
		
		//���ϻ����� �ƴ� ��� 
		for(int i = 0; i < n; i++) { 
			for(int j = 0; j < n; j++) {
				if(!"k[i][j]".equals("k[i][j+1])")) {
					cntX++;
				
			}
				if(!"k[i][j]".equals("k[i+1][j])")) {
					cntX++;
				
			}
				
		}
			
			
		
		}
		
		System.out.println("���ϻ��� �ƴѻ�� : " + cntX);
	
}
	
}
