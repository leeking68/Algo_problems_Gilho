package Problems;

	import java.util.LinkedList;
	import java.util.Queue;

public class NhnTechHani {

	

	   public static void main(String[] args) {
	      /*
	       * �б� ���� �ڵ尡 ���� �ڵ� �Դϴ�. �б� ���� �ڵ�� �ۼ��� �ּ���. �ð� ���⵵�� �޸� �̽�, ������ ���ɿ� ������
	       * �μ���. �䱸 ������ ��ȣ�ϴٸ�, �� �κ��� �������Ͽ� �����ϰ� �����Ͻÿ�.
	       * 
	       * ���� ) A�� �ؿ� ������ �����ϸ�, ���� ��ȭ 100������ �����Ѵ�. �湮���� ȭ������� N�̸�, 100N, 50N,
	       * 20N, 10N, 5N, 1N �� ���� �����Ѵ�.
	       * 
	       * ȯ���Ϸ��� A�� �䱸������ ������ ����. ���� ������ 1�� �̻� ȯ�� �Ͼ����� ���ڴ�. 100N �� 4��, 50N ��
	       * 4�常 ȯ���ϰ� �ʹ�. 1N �� 20�� �̻� ȯ���ϰ� �ʹ�. 20N���� 1N���� ����κ�(ȭ������� ���������� 1�徿)����
	       * ȯ���ϸ�, �츮�� 2,000�� ���ϴ� �ܵ����� �ް� �ʹ�. (Ư������ �߰��Ͽ� 100������ ������ �� ���� �����ϰ� �ٽ�
	       * ����κ�)
	       * 
	       * 100�������� ȯ���� �� �ִ� ȭ���� ����� ȯ�� �� ���� �ܵ��� ����Ͻÿ�. ( ȯ���� 1N �� ��ȭ 1,322������
	       * �Ѵ�. )
	       * 
	       * ��� ��) 100N : 4��, 50N : 4��, 20N : 4��, 10N : 3��, 5N : 4��, 1N : 25��
	       * 
	       * �ܵ� : 1890��
	       */
	      
	      int N = 1322, sum = 0, total = 1000000, plus;
	      
	      Queue<Money> qu = new LinkedList<Money>();
	      
	      sum = 100*4*N + 50*4*N;
	      
	      qu.add(new Money(20,0));
	      qu.add(new Money(10,0));
	      qu.add(new Money(5,0));
	      qu.add(new Money(1,20));
	      
	      do {
	         Money m = qu.remove();
	         
	         m.setCnt((int)m.getCnt() + 1);
	         
	         plus = m.getMoney()*N;
	         
	         if(total-sum > plus ) {
	        	 System.out.println((total-sum)+"::"+plus);
	            sum = sum + plus;
	            qu.add(m);
	            System.out.println("m.getMoney() : " + m.getMoney());
	            System.out.println("m.getCnt() :" + m.getCnt());
	            
	            if(total-sum < 2000)
	               break;
	         }
	         
	      } while (true);
	      
	      
	      System.out.println("�ܵ� :" + (total - sum));
	      
	   }
	}


	class Money
	{
	   private int money;
	   private int cnt;
	   
	   public Money(int money, int cnt) {
	      this.money = money;
	      this.cnt = cnt;
	   }

	   public int getMoney() {
	      return money;
	   }

	   public int getCnt() {
	      return cnt;
	   }

	   public void setCnt(int cnt) {
	      this.cnt = cnt;
	   }
	   
}
