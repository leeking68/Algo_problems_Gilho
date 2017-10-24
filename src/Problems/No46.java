package Problems;
import java.util.Scanner;

//문제
//오늘은 2007년 1월 1일 월요일이다. 그렇다면 2007년 x월 y일은 무슨 요일일까? 이를 알아내는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 빈 칸을 사이에 두고 x(1≤x≤12)와 y(1≤y≤31)이 주어진다. 참고로 2007년에는 1, 3, 5, 7, 8, 10, 12월은 31일까지, 4, 6, 9, 11월은 30일까지, 2월은 28일까지 있다.
//
//출력
//첫째 줄에 x월 y일이 무슨 요일인지에 따라 SUN, MON, TUE, WED, THU, FRI, SAT중 하나를 출력한다.

public class No46 {

	//날짜계산 범위는 1~365
	static int cnt = 0;
	
	public int day(int x, int y) {
	
		switch(x) {
		
		case 1 :  y = y;
				    break;
		case 2 :  y +=31;
				    break;
		case 3 :  y +=59;
					break;
		case 4 :  y +=70;
					break;
		case 5 :  y +=100;
					break;
		case 6 :  y +=131;
					break;
		case 7 :  y +=161;
					break;
		case 8 :  y +=192;
					break;
		case 9 :  y +=223;
					break;
		case 10 :  y +=253;
					break;
		case 11 :  y +=284;
					break;
		case 12 :  y +=314;	
					break;
		}
//		System.out.print(y+":::");
		return y;
	}
	
	public void whatDay(int num) {
		int mod = num%7;
//		System.out.print("요일입니다." + mod);
		if(mod == 1) {
			System.out.print("MON");
		} else if(mod == 2) {
			System.out.print("TUE");
		} else if(mod == 3) {
			System.out.print("WED");
		} else if(mod == 4) {
			System.out.print("THR");
		} else if(mod == 5) {
			System.out.print("FRI");
		} else if(mod == 6) {
			System.out.print("SAT");
		} else if(mod == 0) {
			System.out.print("SUN");
		}
		
	}
	
	
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		
		No46 no = new No46();
		
		int x = in.nextInt();
		int y = in.nextInt();
		
		int num = no.day(x,y);
		
		no.whatDay(num);
		
		
	}
}
