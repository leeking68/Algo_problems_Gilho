package Problems;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

class Solution1 {
  int MOD = 20170805;
  public static int m,n,dx[] = {-1,1,0,0},dy[] = {0,0,-1,1},cityMap[][],d[][],map[][];
  public static void main(String args[]) {
	  Scanner in = new Scanner(System.in);
	   m = in.nextInt();
	   n = in.nextInt();
	  cityMap = new int[m+1][n+1];
	  d = new int [m+1][n+1];
	  map = new int[m+1][n+1];
	  for(int i = 0; i <= m; i++) {
		  for(int j = 0; j <= n; j ++) {
			  cityMap[i][j] = 0;
			  d[i][j] = 0;
			  map[i][j] = 0;
		  }
	  }
	  for(int i = 1; i <=m; i++) {
		  for(int j = 1; j <=n; j++) {
			  cityMap[i][j] = in.nextInt();
		  }
	  }
	  int goal = solution(m,n,cityMap);
	  System.out.println(goal);
  }
  public static int solution(int m, int n, int[][] cityMap) {
      int answer = 0;
      d[1][1] = 1;
      for(int i = 0; i <=n; i++) {
    	  d[0][i] = 1;
      }
     
      for(int i = 1; i<=m; i++) {
    	  for(int j = 1; j<=n; j++) {
    		  map[i][j] = cityMap[i-1][j-1];
    	  }
      }
    	  for(int i = 1; i <=m; i++) {
    	 for(int j = 1; j <=n; j++) {
    		if(map[i][j]==0) {
    			d[i][j] = d[i-1][j]+d[i][j-1];
    		} else if (map[i][j]==2) {
    			d[i][j] = d[i][j-1];
    		}
    	 }
    	 answer = d[m-1][n-1];
      
  }
	return answer;
  
	  
  
  }
  
  static class Solu {
	  int x;
	  int y;
	  public Solu(int x, int y) {
		  this.x = x;
		  this.y = y;
	  }
  }
  
  public static boolean isRange(int sx,int sy) {
	  return (sx>=0&&sx<m&&sy>=0&&sy<n);
  }
}