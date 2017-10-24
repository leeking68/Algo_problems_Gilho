package Problems;
//27/25


public class No27 {

	
	public static void main(String args[]) {
		No27 no = new No27();
		
//		StringBuffer ch = new StringBuffer();
		String ch;
		int total = 0;
		
		for(int i = 0; i<10000; i++) {
			ch = String.valueOf(i);
			
			for(int j = 0; j<ch.length(); j++) {
				
				if(ch.charAt(j)=='8') {
					total++;
				}
			}
			
		}
		
		System.out.println("�Ѱ�����:" + total);
		
	}
}
