package Problems;
//DP , ����2096 , no68

import java.util.Scanner;

public class No68 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int dp_max[] = new int[3];
		int dp_min[] = new int[3];
		
		int max = -1, min = 999, val = 0;
		int max1 = 0, max2 = 0, max3 = 0, min1 = 0, min2 = 0, min3 = 0;
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 3; j++) {
				val = sc.nextInt();
				
				if(j==0) {
					max1 = val + Math.max(dp_max[j], dp_max[j+1]);
					min1 = val + Math.min(dp_min[j], dp_min[j+1]);
				}
				else if(j==1) {
					max2 = val + Math.max(dp_max[j-1], Math.max(dp_max[j],dp_max[j+1]));
					min2 = val + Math.min(dp_min[j-1], Math.min(dp_min[j],dp_min[j+1]));
				}
				else if(j==2) {
					max3 = val + Math.max(dp_max[j], dp_max[j-1]);
					min3 = val + Math.min(dp_min[j], dp_min[j-1]);
				}
			}
			dp_max[0] = max1; dp_max[1] = max2; dp_max[2] = max3;
			dp_min[0] = min1; dp_min[1] = min2; dp_min[2] = min3;
		}
		
		for(int i = 0; i < 3; i++) {
			max = Math.max(max, dp_max[i]);
			min = Math.min(min, dp_min[i]);
		}
		
	}

}
