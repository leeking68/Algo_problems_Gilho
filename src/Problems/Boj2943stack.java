package Problems;

//백준 2 2953 스택 
import java.util.Stack;
import java.util.Scanner;

public class Boj2943stack {

	public static int n;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		Stack<Integer> st = new Stack<>();
		Stack<Integer> index = new Stack<>();
		StringBuilder line = new StringBuilder();
		
		st.push(in.nextInt());
		index.push(1);
		line.append("0 ");
		for (int i = 2; i <=n; i++) {
			int value = in.nextInt();
			int check = 0;
			while (!st.isEmpty()) {
				if(value < st.peek()){
					line.append(index.peek() + " ");
					check = 1;
					break;
				}
				
				st.pop();
				index.pop();
			}
			
			if(check == 0) {
				line.append("0" + " ");
			}
			
			st.push(value);
			index.push(i);
			
			
		}
		
		System.out.println(line);

	}

}
