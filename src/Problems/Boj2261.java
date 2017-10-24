package Problems;
//다른 풀이랑 비교 ! 
import java.util.Scanner;

public class Boj2261 {

	public static int arr[][];
	public static int n;
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		arr = new int[n][2];

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 2; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		
		System.out.println(distance());
	}	
	
	public static int distance(){
		int min = 999999;
		
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				if(arr[i][0]==arr[j][0]&&min > (arr[i][1]-arr[j][1])*(arr[i][1]-arr[j][1])){
					min = (arr[i][1]-arr[j][1])*(arr[i][1]-arr[j][1]);
				} else if(arr[i][1]==arr[j][1]&&min > (arr[i][0]-arr[j][0])*(arr[i][0]-arr[j][0])) {
					min = (arr[i][0]-arr[j][0])*(arr[i][0]-arr[j][0]);
				} else if(min*min > (arr[i][1]-arr[j][1])*(arr[i][1]-arr[j][1])+(arr[i][0]-arr[j][0])*(arr[i][0]-arr[j][0])) {
					min = (arr[i][1]-arr[j][1])*(arr[i][1]-arr[j][1])+(arr[i][0]-arr[j][0])*(arr[i][0]-arr[j][0]);
				}
			}
		}
		
		return min;
		
	}
}
