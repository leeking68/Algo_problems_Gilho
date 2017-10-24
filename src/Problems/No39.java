package Problems;
//37/39



import java.util.Scanner;

public class No39 {
	public static int map[][] = new int[4][4];
	public static int n;
	public static int search(int cnt) {
		int max = 0;
		
		//�ִ밪
		if(cnt==5) {
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					max = Math.max(max, map[i][j]);
				}
			}
			return max;
		}
		
		int result[][] = new int[n][n];
		
		//new �迭
		for(int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				result[i][j] = map[i][j]; 
			}
		}
		
		// w : ����
        // 0:����, 1:������, 2:����, 3:�Ʒ���
        for (int w = 0; w < 4; w++) {
            
            // �������� �̵�
            if (w == 0) {
                for (int i=0; i<n; i++) {
                    //0 �б�
                    for (int j=0; j<n-1; j++) {
                        if (map[i][j] == 0 && map[i][j+1] != 0) {
                            map[i][j] = map[i][j+1];
                            map[i][j+1] = 0;
                            j = -1;
                        }
                    }
                    //���� ���� ��ġ��
                    for (int j=0; j<n-1; j++) {
                        if (map[i][j] == map[i][j+1] && map[i][j] != 0) {
                            map[i][j] = 2 * map[i][j];
                            map[i][j+1] = 0;
                        }
                    }
                    //0 �б�
                    for (int j=0; j<n-1; j++) {
                        if (map[i][j] == 0 && map[i][j+1] != 0) {
                            map[i][j] = map[i][j+1];
                            map[i][j+1] = 0;
                            j = -1;
                        }
                    }
                }
            }
 
            // ���������� �̵�
            if (w == 1) {
                for (int i=0; i<n; i++) {
                    //0 �б�
                    for (int j=n-1; j>0; j--) {
                        if (map[i][j] == 0 && map[i][j-1] != 0) {
                            map[i][j] = map[i][j-1];
                            map[i][j-1] = 0;
                            j = n;
                        }
                    }
                    //���� ���� ��ġ��
                    for (int j=n-1; j>0; j--) {
                        if (map[i][j] == map[i][j-1] && map[i][j] != 0) {
                            map[i][j] = 2 * map[i][j];
                            map[i][j-1] = 0;
                        }
                    }
                    //0 �б�
                    for (int j=n-1; j>0; j--) {
                        if (map[i][j] == 0 && map[i][j-1] != 0) {
                            map[i][j] = map[i][j-1];
                            map[i][j-1] = 0;
                            j = n;
                        }
                    }
                }
            }
 
            // �������� �̵�
            if (w == 2) {
                for (int j=0; j<n; j++) {
                    //0 �б�
                    for (int i=0; i<n-1; i++) {
                        if (map[i][j] == 0 && map[i+1][j] != 0) {
                            map[i][j] = map[i+1][j];
                            map[i+1][j] = 0;
                            i = -1;
                        }
                    }
                    //���� ���� ��ġ��
                    for (int i=0; i<n-1; i++) {
                        if (map[i][j] == map[i+1][j] && map[i][j] != 0) {
                            map[i][j] = 2 * map[i][j];
                            map[i+1][j] = 0;
                        }
                    }
                    //0 �б�
                    for (int i=0; i<n-1; i++) {
                        if (map[i][j] == 0 && map[i+1][j] != 0) {
                            map[i][j] = map[i+1][j];
                            map[i+1][j] = 0;
                            i = -1;
                        }
                    }
                }
            }
 
            // �Ʒ������� �̵�
            if (w == 3) {
                for (int j=0; j<n; j++) {
                    //0 �б�
                    for (int i=n-1; i>0; i--) {
                        if (map[i][j] == 0 && map[i-1][j] != 0) {
                            map[i][j] = map[i-1][j];
                            map[i-1][j] = 0;
                            i = n;
                        }
                    }
                    //���� ���� ��ġ��
                    for (int i=n-1; i>0; i--) {
                        if (map[i][j] == map[i-1][j] && map[i][j] != 0) {
                            map[i][j] = 2 * map[i][j];
                            map[i-1][j] = 0;
                        }
                    }
                    //0 �б�
                    for (int i=n-1; i>0; i--) {
                        if (map[i][j] == 0 && map[i-1][j] != 0) {
                            map[i][j] = map[i-1][j];
                            map[i-1][j] = 0;
                            i = n;
                        }
                    }
                }
            }
 
            max = Math.max(max, search(cnt + 1));
 
            // �������� ����
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    map[i][j] = result[i][j];
                }
            }
        }
        return max;
		
		
		
	}
	
	
	
	public static void main(String args[]) throws CloneNotSupportedException {
		No39 no = new No39();
		
		Scanner in = new Scanner(System.in);
		
		n = in.nextInt();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.println("map : i"+","+"j"+"���� �Է��Ͻÿ�");
				map[i][j] = in.nextInt();
			}
		}
		
		System.out.println(no.search(0));
		no.clone();
		
		
		
		
				
		
	
	}
}
