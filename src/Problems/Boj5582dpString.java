package Problems;
//백준 5582 공통부문문자
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.OutputStreamWriter;
public class Boj5582dpString {

	public static int len1,len2,n,max=0;
	public static String str1,str2,sub;
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out)) ;		
		str1 = in.readLine();
		str2 = in.readLine();
		
		if(str1.length()>str2.length()) {
			sub = str1;
			str1 = str2;
			str2 = sub;
		}
		
		len1 = str1.length();
		len2 = str2.length();
	
		cal();
		out.write(max);
		out.close();
		in.close();
	}
	
	public static void cal() {
		int i , j;
		for(i=j=0; i < len1 &&j<len2;){
			sub = str1.substring(i,j+1);
			
			if(str2.contains(sub)) {
				j++;
				if(sub.length() > max ) {
					max = sub.length();
				}
			} else if ( i==j ) {
				j++;
			} else {
				i++;
			}
		}
	}
}
