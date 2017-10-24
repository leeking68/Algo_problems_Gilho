package Problems;
//����
//�����̴� ������ ���ٲ����� �ϰ� �ִ�. �����̴� ���� �� N(0 �� N �� 100,000)�� �ְ�, ������ �� K(0 �� K �� 100,000)�� �ִ�. �����̴� �Ȱų� �����̵��� �� �� �ִ�. ����, �������� ��ġ�� X�� �� �ȴ´ٸ� 1�� �Ŀ� X-1 �Ǵ� X+1�� �̵��ϰ� �ȴ�. �����̵��� �ϴ� ��쿡�� 1�� �Ŀ� 2*X�� ��ġ�� �̵��ϰ� �ȴ�.
//
//�����̿� ������ ��ġ�� �־����� ��, �����̰� ������ ã�� �� �ִ� ���� ���� �ð��� �� �� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//�Է�
//ù ��° �ٿ� �����̰� �ִ� ��ġ N�� ������ �ִ� ��ġ K�� �־�����.
//
//���
//�����̰� ������ ã�� ���� ���� �ð��� ����Ѵ�.
//
//���� �Է�  ����
//5 17
//���� ���  ����
//4
//��Ʈ
//�����̰� 5-10-9-18-17 ������ ���� 4�ʸ��� ������ ã�� �� �ִ�.

import java.util.LinkedList;
import java.util.Scanner;
/**
 *
 * @author pooh.explorer
 * https://www.acmicpc.net/problem/1697
 */
public class No34 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start,end;
        start = sc.nextInt();
        end = sc.nextInt();
        sc.close(); // �Է�����
         
        BFS(start,end); // ������, ���� �Է�
    }
    public static void BFS(int start, int end){
        boolean[] isVisits = new boolean[100001]; // �湮�迭
        LinkedList<Point> queue = new LinkedList<Point>(); // BFS�� �̿��� queue
        queue.add(new Point(start, 0));
         
        while(!queue.isEmpty()){
            Point point = queue.poll();
            isVisits[point.getValue()] = true;
            if(point.getValue() == end) {
                System.out.print(point.getCount());
                break;
            }
            if(point.getValue()-1>=0 && !isVisits[point.getValue()-1])
                queue.add(new Point(point.getValue()-1, point.getCount()+1));
            System.out.println(""+isVisits[point.getValue()-1]);
            if(point.getValue()+1<=100000 && !isVisits[point.getValue()+1])
                queue.add(new Point(point.getValue()+1, point.getCount()+1));
            if(point.getValue()*2<=100000 && !isVisits[point.getValue()*2])
                queue.add(new Point(point.getValue()*2, point.getCount()+1));
             
        }
    }
     
     
    private static class Point{
        int value;
        int count;
        public Point(int value,int count){
            this.value = value;
            this.count = count;
        }
        public int getValue() {
            return value;
        }
        public void setValue(int value) {
            this.value = value;
        }
        public int getCount() {
            return count;
        }
        public void setCount(int count) {
            this.count = count;
        }
    }
 
}


