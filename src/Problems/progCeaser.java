package Problems;
class progCaesar {
	StringBuffer caesar(String s, int n) {
		String[] res = s.split(" ");
    StringBuffer result = new StringBuffer();
   
    for(int i = 0; i < res.length-1; i++) {
    	int a = res[i].charAt(0); 
    	result.append(Character.toString((char) (a+n)));
    	result.append(" ");
    }
    int a = res[res.length-1].charAt(0); 
    result.append(Character.toString((char) (a+n)));
    
		// 함수를 완성하세요.

		return result;
	}

	public static void main(String[] args) {
		progCaesar c = new progCaesar();
		System.out.println("s는 'a B z', n은 4인 경우: " + c.caesar("a B z", 4));
	}
}
