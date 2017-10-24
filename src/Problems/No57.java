package Problems;
//���� 1076�� 

import java.util.HashMap;
import java.util.Scanner;

public class No57 {
	
	static HashMap<String, String> mapResult = new HashMap<String, String>();
	static HashMap<String, String> mapMulti = new HashMap<String, String>();
	
	public String result(String color) {
		
		String result;
		
		if(mapResult.containsKey(color)) {
			result = mapResult.get(color);
			return result;
		}
		return null;
	}
	
	public String multi(String color) {
		
		String result;
		
		if(mapMulti.containsKey(color)) {
			result = mapMulti.get(color);
			return result;
		}
		return null;
	}
	
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		
		No57 no = new No57();
		
		String first = in.nextLine();
		String second = in.nextLine();
		String third = in.nextLine();
		
		mapResult.put("black", "0");
		mapResult.put("brown", "1");
		mapResult.put("red", "2");
		mapResult.put("orange", "3");
		mapResult.put("yellow", "4");
		mapResult.put("green", "5");
		mapResult.put("blue", "6");
		mapResult.put("violet", "7");
		mapResult.put("grey", "8");
		mapResult.put("white", "9");
		
		mapMulti.put("black", " ");
		mapMulti.put("brown", "0");
		mapMulti.put("red", "00");
		mapMulti.put("orange", "000");
		mapMulti.put("yellow", "0000");
		mapMulti.put("green", "00000");
		mapMulti.put("blue", "000000");
		mapMulti.put("violet", "0000000");
		mapMulti.put("grey", "00000000");
		mapMulti.put("white", "000000000");
		
		
		first = no.result(first);
		second = no.result(second);
		third = no.multi(third);
		
		System.out.print(first+second+third);
		
	}
}
