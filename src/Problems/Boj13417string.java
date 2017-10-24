package Problems;
import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Boj13417string {
	
	public static int t,n;
	public static String res;
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		t = Integer.parseInt(in.readLine());
		String card;
		while(t-->0) {
			n = Integer.parseInt(in.readLine());
			card = in.readLine().replaceAll(" ","");
			res = card.substring(0,1);
			for(int i = 1; i < n; i++) {
				System.out.println(card.charAt(i));
				System.out.println((int)card.indexOf(i));
				position(card.charAt(i));
			}
			out.write(res);
			out.newLine();
		}
		out.close();
		in.close();
	}
	
	public static void position(char card){
		System.out.println("card" + (int)card  + " res" + (int)res.charAt(0));
		if(card <= res.charAt(0)) {
			res = card + res;
		} else {
			res = res + card;
		}
		
	}

}
