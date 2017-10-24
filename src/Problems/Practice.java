package Problems;

import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Comparator;
public class Practice {

	public static void main(String args[]) {
		
		PriorityQueue<NN>  pq = new PriorityQueue<NN>(new Comparator<NN>(){
			
			@Override
			public int compare(NN n1, NN n2){
				
				if(n1.x<n2.x) {
					return -1;
				}
				
				if(n1.x > n2.x) {
					return 1 ;
					
				}
				
			}
			
		});
		
	}
	
}
 class NN {
	 int x; 
	 int y;
	 public NN(int x, int y) {
		 this.x = x;
		 this.y = y ;
	 }
 }