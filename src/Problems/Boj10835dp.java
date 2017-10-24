package Problems;

// 백준 10835 카드게임 동적 

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Boj10835dp {

	public static int n;
	public static Queue<Integer> qA = new LinkedList<Integer>();
	public static Queue<Integer> qB = new LinkedList<Integer>();
	public static Queue<Integer> qSum =new LinkedList<Integer>();

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		
		for (int i = 0; i < n; i++) {
			qA.add(in.nextInt());
		}
		for (int i = 0; i < n; i++) {
			qB.add(in.nextInt());
		}
		
		
	}
	
	public static void cardGame() {
	
	}

	public static void ruel1() {
		qA.poll();
		qB.poll()
	}
	
	public static void rule2() {
		
	}
	
	public static void rule3() {
		
	}
}
