package Problems;
//36/38

import java.util.Scanner;


public class No38 {

	public 
	
	public static void main(String args[]) {
		
		No38 no = new No38();
		
		Scanner in = new Scanner(System.in);
	
		System.out.println("L�� �Է�");
		int l = in.nextInt();
		
		int map[][] = new int[l][l];
		
		System.out.println("��ɾ��� ���� ");
		int cmdCnt = in.nextInt();
		
		String cmd[] = new String[cmdCnt];
		
		for(int i = 0; i < cmdCnt; i++) {
			System.out.println("����:" + i);
			
			System.out.println("��ɾ �Է��Ͻÿ�.");
			
			cmd[i] = in.nextLine();
		}
		
		//start point 
		int startX = 0;
		int startY = 0;
		
		map[0][0] = 1;
		
		
		
		
		for(int k = 0; k < cmdCnt; k++) {
			
			
			
		}
		
	}
}
