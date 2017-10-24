package Problems;
import java.util.Scanner;

public class No16 {
	//
	// static String k[];
	//
	// static No16 nn = new No16();
	//
	// /**�������� ���� ���ǿ� �´��� �ȸ´��� �˻��ϴ�����
	// *
	// * 1. �Ǿտ� 0,-,+ �ȵ�
	// * 2. �ǵڿ� -,+ �ȵ�
	// * 3. -+�� �������� ������ �ȵ� ( ������ ���õ��� �ʾ���)
	// **/
	// public boolean check(StringBuilder form,int n) {
	//
	//
	// if(form.charAt(0)=='0'||form.charAt(0)=='+'||form.charAt(n-1)=='+'||
	// form.charAt(0)=='-'||form.charAt(n-1)=='-') {
	// return false;
	// }
	//
	// for(int i = 0; i < n; i++) {
	// if(form.charAt(i)=='-'&&form.charAt(i)=='+'&&
	// form.charAt(i+1)=='-'&&form.charAt(i+1)=='-') {
	// return false;
	// }
	// }
	//
	//
	// return true;
	//
	// }
	//
	// public String minNum(StringBuilder form,int n) {
	//
	// boolean ck = nn.check(form, n);
	//
	// if (ck==false) {
	// System.out.println("���ڸ� �߸� �Է��߽��ϴ�.");
	// }
	//
	// int total;
	//
	// for(int i = 0; i < n ; i++) {
	// form.insert(i-1,'(');
	//
	// for(int j = 0 ; j < n; j++) {
	// 0.
	// }
	//
	// }
	//
	//
	// return "" ;
	//
	// }
	//
	// public static void main(String args[]) {
	//
	// Scanner in = new Scanner(System.in);
	//
	// StringBuilder form = new StringBuilder(in.next());
	// int n = form.length();
	//
	//
	//
	//
	//
	//
	// }

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		String fom = in.nextLine();

		char arr[] = fom.toCharArray();
		char before[];
		char after[];
		
		
		System.out.println("��:" + arr[0]);
		// check�� �̵��� �����
		String before1 = null;
		String before2 = null;

		for (int n = 0; n < fom.length() - 1; n++) {
			if (arr[n] == '-') {
				
				for(int j = 0; j < n; n++) {
				 
					before1 += arr[j];
					
				}
				
				for(int k = n+1; k<fom.length() -1; k++) {
					
					if(arr[k] == '+') {
						
						for(int h=k; h<k; h++) {
							before2 += arr[k];
						}
					}
					
				}

				}

			}
		}

	}

