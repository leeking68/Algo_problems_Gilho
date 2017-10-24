package Problems;
//38/40 ���� 10543�� , �������ڿ� ���� 


import java.util.Scanner;
import java.util.StringTokenizer;


public class No40 {
	
	public int goodStr(char A[], char B[]) {
		int cnt;
		int k = A.length; // �ݺ����� Ƚ�� 
		//�������ڿ� ��ȯ�� ���� ����
		int aAcnt = 0; 
		int aBcnt = 0;
		
		//���̰� ���� ������ ��ȯ �� �� ����. 
		if(A.length != B.length) 
			return -1;
		
		for(int i = 0; i < k; i++) {
			if(A[i]=='a') {
				aAcnt++;
			} 
			if(B[i]=='a') {
				aBcnt++;
			} 
		}
		//���ڿ� a�� b�� ���� üũ 
		
		if(aAcnt != aBcnt) {
			return -1;
		}

		char ch = 0;
		
		for(int i = 0; i < k; i++) {
			
			if(A[i]!=B[i]) {
				
			}
						
		}
		
		
		return 0;
	}
	
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("");
		String str = in.nextLine();
		char A[] = str.toCharArray();
		for(int i=0; i<A.length; i++) {
			System.out.println("A["+i+"]"+":"+" "+A[i]);
		}
		String str2 = in.nextLine();
		char B[] = str2.toCharArray();
			
		
	}

}
